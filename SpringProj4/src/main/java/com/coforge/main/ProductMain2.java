package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.config.ProductConfig;
import com.coforge.dao.ProductDao;
import com.coforge.dao.ProductDaoImpl;
import com.coforge.exception.ProductException;
import com.coforge.model.Product;
import com.coforge.service.ProductServiceImpl;

public class ProductMain2 {

	public static void main(String[] args) throws ProductException {

		// 1st method
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ProductConfig.class);
		ProductServiceImpl service = ctx.getBean(ProductServiceImpl.class);		
		
		// 2nd method
		//
		// ApplicationContext ctx = new AnnotationConfigApplicationContext(ProductServiceImpl.class);
		// ProductServiceImpl service = ctx.getBean(ProductServiceImpl.class);
		
		Product p1[] = new Product[3];
		
		p1[0] = new Product(209, "Flampe", 750.87f);
		p1[1] = new Product(267, "Porridge", 1350.87f);
		// p1[2] = new Product(344, "Soup", 350.87f);
		p1[2] = new Product(267, "Porridge", 1350.87f);
		
		// Using individual try-catch so that the main method doesn't get terminated
		
		try {
			for(Product p: p1) {
			service.addProduct(p);
			}
		} catch(Exception e) {
			System.err.println(e);
		}
		
			try {
				System.out.println("Get All Oerations: \n");
				service.getAllProduct().forEach(p -> System.out.println("\tId: "+p.getPId()+"\tName: "+p.getPName()+"\tCost: "+p.getPCost()));
	
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		
			try {
				System.out.println("\nSearch Operation: ");
				Product searchProd = service.searchProduct(new Product(344, "Soup", 350.87f));
		//		searchProd = dao.searchProduct(new Product(8723, "cup", 230.56f));
				if(searchProd!=null)
					System.out.println("\nFound Product: \n"+searchProd);
				else
					System.out.println("\nNot found");
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		
			try {
				System.out.println("\nUpdate Operation: \n");
				Product searchProd = service.updateProduct(new Product(344, "Soup", 350.87f), new Product(2634, "Manchurian", 150.56f));
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		
			try {
				service.getAllProduct().forEach(p -> System.out.println("\tId: "+p.getPId()+"\tName: "+p.getPName()+"\tCost: 				"+p.getPCost()));
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		
	}
		
}
