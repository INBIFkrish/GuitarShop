package com.niit.guitarshop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.guitarshop.dao.*;
import com.niit.guitarshop.model.*;

@Controller
public class UserController {

	Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	User user;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	
	
	
	
	
	 /* if invalid credentials ->  Home page , login ,  error message
	 * if valid credentials  && he is admin ->  AdminHome page ,logout link
	 * if valid credentials && he is end user ->  Home page, cart, logout link
	 * @param userID
	 * @param password
	 * @return it will return data and page name where to return
	 */
	
	@RequestMapping(value = {"/login"})
	public ModelAndView getLogin(){
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("ifLoginClicked", true);
		return mv;
	}

	@ModelAttribute("user")
	public User loadEmptyModelBean(){
	   return new User();
	}
	
	@ModelAttribute("userLogin")
	public User loadEmptyModelBeanForLogin(){
		   return new User();
		}
	
	
	
	
	@RequestMapping(value = "user/register", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute User user, @RequestParam(value = "id") String userID, 
			@RequestParam(value = "pass") String password) {
		
		user.setId(userID);
		user.setPassword(password);
		userDAO.saveOrUpdate(user);
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("userRegistered", true);
		
		return mv;
	}
	
	
	@RequestMapping(value = "user/login")
	@ModelAttribute("userLogin")

	public ModelAndView login(@RequestParam(value = "id") String userID,
			@RequestParam(value = "pass") String password, HttpSession session) {
		log.debug("Starting of the method login");
		log.info("userID is {}  password is {}", userID, password);

	
		ModelAndView mv = new ModelAndView("menu");
		boolean isValidUser = userDAO.isValidUser(userID, password);
	
		if (isValidUser == true) {
			user = userDAO.get(userID);
			session.setAttribute("loggedInUser", user.getId());
			if (user.isAdmin() == true) {
				mv.addObject("isAdmin", "true");

			} 
			
			else {
				mv.addObject("isAdmin", "false");
			//	cart = cartDAO.get(userID);
			//	mv.addObject("cart", cart);
			//	List<Cart> cartList = cartDAO.list();
			//	mv.addObject("cartList", cartList);
			//	mv.addObject("cartSize", cartList.size());
			}
			

		} else {

			mv.addObject("invalidCredentials", "true");
			mv.addObject("errorMessage", "Invalid Credentials");
			

		}
		log.debug("Ending of the method login");
		return mv;
	}

	 
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView("/home");
		session.invalidate();
		session = request.getSession(true);
		//session.setAttribute("category", category);
		//session.setAttribute("categoryList", categoryDAO.list());
	
		mv.addObject("logoutMessage", "You successfully logged out");
		mv.addObject("loggedOut", "true");
	
		return mv;
	 }

}
