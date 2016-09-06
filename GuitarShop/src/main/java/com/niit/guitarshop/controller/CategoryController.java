package com.niit.guitarshop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.guitarshop.dao.CategoryDAO;
import com.niit.guitarshop.model.Category;

@Controller
@ComponentScan("com.niit.guitarshop.controller")

public class CategoryController {

	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	Category category;
	
	@RequestMapping(value = {"/category"})
	public ModelAndView getCategoryPage(){
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("ifCategoryClicked", true);
		return mv;
	}
	
	@ModelAttribute("category")
	public Category loadEmptyModelBean(){
	   return new Category();
	}
	
	@RequestMapping(value = "admin/category", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute Category category) {
		
		categoryDAO.saveOrUpdate(category);
		ModelAndView mv = new ModelAndView("/home");
		
		return mv;
	}
	
}
