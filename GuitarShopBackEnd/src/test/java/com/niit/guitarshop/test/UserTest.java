package com.niit.guitarshop.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.guitarshop.dao.UserDAO;
import com.niit.guitarshop.model.User;

public class UserTest {
	
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.guitarshop");
		context.refresh();
		
	User u =(User)	  context.getBean("user");
	
	UserDAO userDAO = (UserDAO)  context.getBean("userDAO");
	
	
	
	userDAO.delete("test");
	
	
	System.out.println("Worked");
	
	
	
	List<User>  list =    userDAO.list();
	
	for(User use : list)
	{
		System.out.println(use.getId()  + ":" +  use.getPass()  + ":"+  use.isAdmin());
	}
		
		
	}

}
