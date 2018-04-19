package com.beini.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, String>, JpaSpecificationExecutor<Order> {

}
