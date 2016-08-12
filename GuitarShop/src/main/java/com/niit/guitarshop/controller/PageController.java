package com.niit.guitarshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home"})
	public String index() {
		System.out.println("controller");
	/*	ModelAndView mv = new ModelAndView("page");
		mv.addObject("ifUserClickedHome", true);
		mv.addObject("home");
		return mv;*/
		return "home";
		
	} 
	
	@RequestMapping(value = {"/login"})
	public String login() {
		System.out.println("controller");
		return "login";
		
	}
	
	@RequestMapping(value = {"/category"})
	public String category() {
		System.out.println("category");
		return "category";
		
	}
	
}