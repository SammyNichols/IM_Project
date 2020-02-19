package com.inventoryProject.IMProject.repository;

import org.springframework.data.repository.CrudRepository;

import com.inventoryProject.IMProject.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
