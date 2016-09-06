package com.niit.guitarshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan("com.niit.guitarshop.controller")

public class PageController {
	
	@RequestMapping(value = { "/", "/home" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("ifHomeClicked", true);
		return mv;
	}
	
	@RequestMapping(value = { "/acoustic" })
	public ModelAndView Acoustic() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("ifAcousticClicked", true);
		return mv;
	}
	
	@RequestMapping(value = { "/electric" })
	public ModelAndView Electric() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("ifElectricClicked", true);
		return mv;
	}
	
	@RequestMapping(value = { "/ukulele" })
	public ModelAndView Ukulele() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("ifUkuleleClicked", true);
		return mv;
	}
	
	
	
	
	
		
	


}