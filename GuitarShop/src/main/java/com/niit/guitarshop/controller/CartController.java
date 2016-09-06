package com.niit.guitarshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.guitarshop.dao.CartDAO;
import com.niit.guitarshop.model.Cart;
import com.niit.guitarshop.model.User;

@Controller
public class CartController {
	@Autowired
	private CartDAO cartDAO;
	
	@Autowired
	private Cart cart;
	
	@ModelAttribute("cart")
	public Cart loadEmptyModelBeanForCart(){
		   return new Cart();
	}
	
	@RequestMapping(value = "addtocart", method = RequestMethod.POST)
	public ModelAndView addToCart(@ModelAttribute Cart cart, @RequestParam(value = "name") String cartID, 
			@RequestParam(value = "price") double price) {
		
		
		if (cartDAO.get(cartID) != null) {
			cart.setQuatity(6);
		} else {
			cart.setName(cartID);
			cart.setPrice(price);
			cart.setQuatity(1);
		}
		cartDAO.saveOrUpdate(cart);
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("cartList", cartDAO.list());
		
		return mv;
	}
}
