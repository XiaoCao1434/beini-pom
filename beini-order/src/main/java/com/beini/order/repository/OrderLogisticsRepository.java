package com.beini.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.order.entity.OrderLogistics;

public interface OrderLogisticsRepository extends JpaRepository<OrderLogistics, String>, JpaSpecificationExecutor<OrderLogistics> {

}
