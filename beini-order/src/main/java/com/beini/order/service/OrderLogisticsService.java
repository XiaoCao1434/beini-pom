package com.beini.order.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.beini.order.entity.OrderLogistics;

public interface OrderLogisticsService {
	/*查询*/
	Page<OrderLogistics> findAll(Pageable pageable);
	OrderLogistics findById(String id);
	/*更新*/
	OrderLogistics save(OrderLogistics bean);
	OrderLogistics update(OrderLogistics bean);
	void delete(String... id);
}
