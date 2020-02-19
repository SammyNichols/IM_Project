package com.inventoryProject.IMProject.repository;

import org.springframework.data.repository.CrudRepository;

import com.inventoryProject.IMProject.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
