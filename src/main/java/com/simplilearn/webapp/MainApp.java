package com.simplilearn.webapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.simplilearn.webapp.bean.Product;


public class MainApp {

	public static void main(String [] args) {
		
		// Create an object of that Product 
//		
//		Product product = new Product ();
//		
//		product.setId(1001);
//		product.setName("Apple Mac Book");
//		product.setPrice(4563.54);
//		product.setDescription("It is a Laptop");
//		product.setBrand("apple");
//		product.setStatus(true);
//		
//		System.out.println(product);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("product-bean.xml");  
		Product productOne = (Product) context.getBean("product1");
		Product productTwo = context.getBean("product2", Product.class );
		
		
		System.out.println(productOne);
		System.out.println(productTwo);
		
		System.out.println("::--------------------------------::");
		
		// 2. Bean Factory Container
		Resource resource = new ClassPathResource("product-bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Product productA = (Product) factory.getBean("product1");
		Product productB = factory.getBean("product2", Product.class );
		
		System.out.println(productA);
		System.out.println(productB);		
		
		}
	}

