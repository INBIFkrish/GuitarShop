package com.niit.guitarshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	/*@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView onLoad() {
		System.out.println("home");
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("ifHomeClicked", true);

		return mv;
	}

	@RequestMapping(value = { "/category" })
	public ModelAndView category() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("ifCategoryClicked", true);
		return mv;

	}

	@RequestMapping(value = { "/login" })
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("ifLoginClicked", true);
		return mv;

	}*/
	
	@RequestMapping(value = { "/", "/index", "/home" })
	public String index	() {
		return "home";
	}
	
	



}