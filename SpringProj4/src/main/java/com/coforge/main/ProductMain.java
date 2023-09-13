package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.dao.ProductDao;
import com.coforge.dao.ProductDaoImpl;
import com.coforge.exception.ProductException;
import com.coforge.model.Product;
import com.coforge.service.ProductServiceImpl;

public class ProductMain {

	public static void main(String[] args) throws ProductException {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ProductDaoImpl.class);
		ProductDaoImpl dao = ctx.getBean(ProductDaoImpl.class);
		
		Product p1[] = new Product[3];
		
		p1[0] = new Product(209, "Flampe", 750.87f);
		p1[1] = new Product(267, "Porridge", 1350.87f);
		p1[2] = new Product(344, "Soup", 350.87f);
		
		try {
			for(Product p: p1) {
				dao.addProduct(p);
		}
		
		System.out.println("Get All Oerations: \n");
		dao.getAllProducts().forEach(p -> System.out.println("\tId: "+p.getPId()+"\tName: "+p.getPName()+"\tCost: "+p.getPCost()));
	
		System.out.println("\nSearch Operation: ");
		Product searchProd = dao.searchProduct(new Product(344, "Soup", 350.87f));
//		searchProd = dao.searchProduct(new Product(8723, "cup", 230.56f));
		if(searchProd!=null)
			System.out.println("\nFound Product: \n"+searchProd);
		else
			System.out.println("\nNot found");
		
		System.out.println("\nUpdate Operation: \n");
		searchProd = dao.updateProduct(new Product(344, "Soup", 350.87f), new Product(2634, "Manchurian", 150.56f));
	
		dao.getAllProducts().forEach(p -> System.out.println("\tId: "+p.getPId()+"\tName: "+p.getPName()+"\tCost: "+p.getPCost()));
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		
	}
		
}
