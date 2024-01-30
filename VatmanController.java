package ro.emanuel.vatman.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ro.emanuel.vatman.dao.VatmanDao;
import ro.emanuel.vatman.pojo.Vatman;

@Controller
public class VatmanController {
	@GetMapping("/vatmans/all")
	public ModelAndView list() throws SQLException {
		ArrayList<Vatman> vatman = VatmanDao.getAllVatman();
		ModelAndView mv = new ModelAndView("allvatmans");
		mv.addObject("vatman", vatman);
		return mv;

	}

	@GetMapping("/vatmans/{id}")
	public ModelAndView vatmanPageById(@PathVariable int id) throws SQLException, IOException {
		ModelAndView mav = new ModelAndView("singlevatman");
		Vatman vatman = VatmanDao.getById(id);
		mav.addObject("vatman", vatman);

		return mav;
	}
	
	@GetMapping("/vatmans/edit/{id}")
	public ModelAndView vatmanEditGet(Model model, @PathVariable int id) throws SQLException, IOException {
		
		Vatman vatman = VatmanDao.getById(id);
		model.addAttribute("vatman", vatman);

		return new ModelAndView("editvatman","model",model);
	}
	
	@PostMapping("/vatmans/edit")
	public ModelAndView vatmanEditSave(@ModelAttribute("vatman") Vatman v,
			ModelMap model, BindingResult result) {
		
		try {
			VatmanDao.update(v);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/vatmans/all");
	}
	
	@GetMapping("/vatmans/add")
	public ModelAndView vatmanAddGet(Model model) throws SQLException, IOException {
		
		Vatman vatman = new Vatman();
		model.addAttribute("vatman", vatman);

		return new ModelAndView("addvatman","model",model);
	}
	
	@PostMapping("/vatmans/add")
	public ModelAndView vatmanAddSave(@ModelAttribute("vatman") Vatman v,
			ModelMap model, BindingResult result) {
		
		try {
			VatmanDao.create(v);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/vatmans/all");
	}
	
	@GetMapping("/vatmans/delete/{id}")
	public ModelAndView vatmanDelete(@PathVariable int id) throws SQLException, IOException {
		
		VatmanDao.delete(id);

		return new ModelAndView("redirect:/vatmans/all");
	}

}
