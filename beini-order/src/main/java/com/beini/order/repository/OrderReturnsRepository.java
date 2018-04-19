package com.beini.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.order.entity.OrderReturns;

public interface OrderReturnsRepository extends JpaRepository<OrderReturns, String>, JpaSpecificationExecutor<OrderReturns> {

}
