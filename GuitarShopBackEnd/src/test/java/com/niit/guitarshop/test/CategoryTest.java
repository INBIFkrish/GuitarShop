package com.niit.guitarshop.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.guitarshop.dao.CategoryDAO;
import com.niit.guitarshop.model.Category;

public class CategoryTest {
	
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.guitarshop");
		context.refresh();
		
	Category c =(Category)	  context.getBean("category");
	
	CategoryDAO categoryDAO = (CategoryDAO)  context.getBean("categoryDAO");
	
	
	c.setId("123");
	c.setName("Test Category");
	c.setDescription("Test Desc");
	
	categoryDAO.saveOrUpdate(c);
	
	System.out.println("Worked");
	
	
	
	List<Category>  list =    categoryDAO.list();
	
	for(Category cat : list)
	{
		System.out.println(cat.getId() + " : " + cat.getName() + " : " + cat.getDescription());
	}
		
		
	}

}
