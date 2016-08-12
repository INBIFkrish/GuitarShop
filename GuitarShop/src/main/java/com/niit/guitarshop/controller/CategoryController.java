package com.niit.guitarshop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.guitarshop.dao.CategoryDAO;
import com.niit.guitarshop.dao.CategoryDAOImp;
import com.niit.guitarshop.model.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAOImp categoryDAO;

	@Autowired
	Category category;


	@RequestMapping(value = "/addCategory", method = RequestMethod.POST)
	public ModelAndView addCategory(@ModelAttribute Category category) {
		
		categoryDAO.saveOrUpdate(category);
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("success");
		
		return mv;
	}
}
