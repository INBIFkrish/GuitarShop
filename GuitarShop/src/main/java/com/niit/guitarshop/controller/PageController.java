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
	
	@RequestMapping(value = { "/" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("ifHomeClicked", true);
		return mv;
	}
	
	
	
	
		
	


}