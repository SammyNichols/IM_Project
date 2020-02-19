package com.inventoryProject.IMProject.repository;

import org.springframework.data.repository.CrudRepository;

import com.inventoryProject.IMProject.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
