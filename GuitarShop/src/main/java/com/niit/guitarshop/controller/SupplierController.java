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

import com.niit.guitarshop.dao.SupplierDAO;
import com.niit.guitarshop.model.Supplier;

@Controller
@ComponentScan("com.niit.guitarshop.controller")

public class SupplierController {

	@Autowired
	SupplierDAO supplierDAO;

	@Autowired
	Supplier supplier;
	
	@RequestMapping(value = {"/supplier"})
	public ModelAndView getSupplierPage(){
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("ifSupplierClicked", true);
		return mv;
	}
	
	@ModelAttribute("supplier")
	public Supplier loadEmptyModelBSean(){
	   return new Supplier();
	}
	
	@RequestMapping(value = "admin/supplier", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute Supplier supplier) {
		
		supplierDAO.saveOrUpdate(supplier);
		ModelAndView mv = new ModelAndView("/home");
		
		return mv;
	}
	
}
