package com.beini.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.order.entity.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, String>, JpaSpecificationExecutor<OrderDetail> {

}
