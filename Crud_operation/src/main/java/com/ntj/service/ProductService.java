package com.ntj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ntj.entity.Product;
import com.ntj.repository.ProductRepository;

@Repository
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product )
	{
		return productRepository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> product )
	{
		return productRepository.saveAll(product);
	}
	
	public List <Product> getProducts()
	{
		return productRepository.findAll();
	}
	
	public Product getProductById(int id)
	{
		return productRepository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name)
	{
		return productRepository.findByName(name);
	}
	
	public String deleteById(int id)
	{
		 productRepository.deleteById(id);
		 return "Product removed successfully ...!"+id;
	}
	
	public Product updateProduct(Product product)
	{
		  Product p=productRepository.findById(product.getId()).orElse(null);
		  p.setName(product.getName());
		  p.setQuantity(product.getQuantity());
		  p.setPrice(product.getPrice());
		  return productRepository.save(p);
	   
	}
}
