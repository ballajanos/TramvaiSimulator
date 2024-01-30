package ro.emanuel.statii.controller;

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

import ro.emanuel.statii.dao.StatiiDao;
import ro.emanuel.statii.pojo.Statii;

@Controller
public class StatiiController {
	@GetMapping("/statiis/all")
	public ModelAndView list() throws SQLException {
		ArrayList<Statii> statii = StatiiDao.getAllStatii();
		ModelAndView mv = new ModelAndView("allstatiis");
		mv.addObject("statii", statii);
		return mv;
	}
	
	@GetMapping("/statiis/{id}")
	public ModelAndView statiiPageById(@PathVariable int id) throws SQLException, IOException {
		ModelAndView mav = new ModelAndView("singlestatii");
		Statii statii = StatiiDao.getById(id);
		mav.addObject("statii", statii);
		return mav;
	}
	
	@GetMapping("/statiis/edit/{id}")
	public ModelAndView statiiEditGet(Model model, @PathVariable int id) throws SQLException, IOException {
		Statii statii = StatiiDao.getById(id);
		model.addAttribute("statii", statii);
		return new ModelAndView("editstatii","model",model);
	}
	
	@PostMapping("/statiis/edit")
	public ModelAndView statiiEditSave(@ModelAttribute("statii") Statii s,
			ModelMap model, BindingResult result) {
		try {
			StatiiDao.update(s);
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return new ModelAndView("redirect:/statiis/all");
	}
	
	@GetMapping("/statiis/add")
	public ModelAndView statiiAddGet(Model model) throws SQLException, IOException {
		Statii statii = new Statii();
		model.addAttribute("statii", statii);
		return new ModelAndView("addstatii","model",model);
	}
	
	@PostMapping("/statiis/add")
	public ModelAndView statiiAddSave(@ModelAttribute("statii") Statii s,
			ModelMap model, BindingResult result) {
		try {
			StatiiDao.create(s);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/statiis/all");
	}
	
	@GetMapping("/statiis/delete/{id}")
	public ModelAndView statiiDelete(@PathVariable int id) throws SQLException, IOException {
		StatiiDao.delete(id);
		return new ModelAndView("redirect:/statiis/all");
	}
}
