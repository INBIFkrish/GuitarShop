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

import com.niit.guitarshop.dao.ProductDAO;
import com.niit.guitarshop.model.Product;

@Controller
@ComponentScan("com.niit.guitarshop.controller")
public class ProductController {

	@Autowired
	ProductDAO productDAO;

	@Autowired
	Product product;
	
	@RequestMapping(value = {"/product"})
	public ModelAndView getProductPage(){
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("ifProductClicked", true);
		return mv;
	}
	
	@ModelAttribute("product")
	public Product loadEmptyModelBean(){
	   return new Product();
	}
	
	@RequestMapping(value = "admin/product", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute Product product) {
		
		productDAO.saveOrUpdate(product);
		ModelAndView mv = new ModelAndView("/home");
		
		return mv;
	}
	
}
