package com.niit.guitarshop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.guitarshop.dao.CategoryDAO;
import com.niit.guitarshop.dao.CategoryDAOImp;
import com.niit.guitarshop.model.Category;

@Controller
@ComponentScan("com.niit.guitarshop.controller")

public class CategoryController {

	@Autowired
	private CategoryDAOImp categoryDAO;

	@Autowired
	Category category;

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public ModelAndView displayCategory(Model model) {
		System.out.println("get this");
		ModelAndView mv = new ModelAndView("category");
		mv.addObject("category", category);
		return mv;
	}

	
	@RequestMapping(value = "/addCategory", method = RequestMethod.POST)
	public String addCategory(@ModelAttribute("categoryForm") Category category, Model model, BindingResult result) {

		System.out.println("post this");

		categoryDAO.saveOrUpdate(category);

		return "home";

	}

	/*@RequestMapping(value = "/addCategory", method = RequestMethod.POST)
	public ModelAndView addCategory(@ModelAttribute("categoryForm") Category category) {
		System.out.println("catcontrol");
		categoryDAO.saveOrUpdate(category);
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("category", category);

		return mv;
	}*/

}
