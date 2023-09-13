package com.coforge.dao;

import java.util.List;

import com.coforge.model.Product;

public interface ProductDao {

	public Product addProduct(Product p);
	public Product removeProduct(Product p);
	public Product updateProduct(Product p1, Product p2);
	public Product searchProduct(Product p);
	
	public List<Product> getAllProducts();
	
}
