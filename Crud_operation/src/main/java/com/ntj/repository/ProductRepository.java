package com.ntj.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntj.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

}
