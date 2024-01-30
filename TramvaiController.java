package ro.emanuel.tramvai.controller;

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
import ro.emanuel.tramvai.dao.TramvaiDao;
import ro.emanuel.tramvai.pojo.Tramvai;


@Controller
public class TramvaiController {
	@GetMapping("/tramvais/all")
	public ModelAndView list() throws SQLException {
		ArrayList<Tramvai> tramvai = TramvaiDao.getAllTramvai();
		ModelAndView mv = new ModelAndView("alltramvais");
		mv.addObject("tramvai", tramvai);
		return mv;
	}
	
	@GetMapping("/tramvais/{id}")
	public ModelAndView tramvaiPageById(@PathVariable int id) throws SQLException, IOException {
		ModelAndView mav = new ModelAndView("singletramvai");
		Tramvai tramvai = TramvaiDao.getById(id);
		mav.addObject("tramvai", tramvai);
		return mav;
	}

	@GetMapping("/tramvais/edit/{id}")
	public ModelAndView tramvaiEditGet(Model model, @PathVariable int id) throws SQLException, IOException {
		Tramvai tramvai = TramvaiDao.getById(id);
		model.addAttribute("tramvai", tramvai);
		return new ModelAndView("edittramvai","model",model);
	}
	
	@PostMapping("/tramvais/edit")
	public ModelAndView tramvaiEditSave(@ModelAttribute("tramvai") Tramvai t,
			ModelMap model, BindingResult result) {
		try {
			TramvaiDao.update(t);
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return new ModelAndView("redirect:/tramvais/all");
	}
	
	@GetMapping("/tramvais/add")
	public ModelAndView tramvaiAddGet(Model model) throws SQLException, IOException {
		Tramvai tramvai = new Tramvai();
		model.addAttribute("tramvai", tramvai);
		return new ModelAndView("addtramvai","model",model);
	}
	
	@PostMapping("/tramvais/add")
	public ModelAndView tramvaiAddSave(@ModelAttribute("tramvai") Tramvai t,
			ModelMap model, BindingResult result) {
		try {
			TramvaiDao.create(t);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/tramvais/all");
	}
	
	@GetMapping("/tramvais/delete/{id}")
	public ModelAndView tramvaiDelete(@PathVariable int id) throws SQLException, IOException {
		TramvaiDao.delete(id);
		return new ModelAndView("redirect:/tramvais/all");
	}
}
