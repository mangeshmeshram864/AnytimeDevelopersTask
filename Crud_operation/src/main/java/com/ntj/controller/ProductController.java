package com.ntj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntj.entity.Product;
import com.ntj.service.ProductService;

@RestController
public class ProductController {
    @Autowired
	private ProductService service;
    
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product)
    {
		return service.saveProduct(product);
    	
    }
    @PostMapping("/addProducts")
    public List<Product> addProduct(@RequestBody List<Product> products)
    {
		return service.saveProducts(products);
    	
    }
    @GetMapping("/Product")
    public List<Product> findAllProduct()
    {
		return service.getProducts();
    	
    }
	
    @GetMapping("/Product/{Name}")
    public Product findProductByName(@PathVariable String Name)
    {
    	return service.getProductByName(Name);
    }
    
    @GetMapping("/Productid/{id}")
    public Product findProductById(@PathVariable int id)
    {
    	return service.getProductById(id);
    }
    
    @PutMapping("/UpdateProduct")
    public Product updateProduct(@RequestBody Product product)
    {
    	return service.updateProduct(product);
    }
    
    @DeleteMapping("/DeleteProduct/{id}")
    public String  deleteProduct(@PathVariable int id)
    {
    	return service.deleteById(id);
    }
    
}
