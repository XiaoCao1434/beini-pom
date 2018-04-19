package com.beini.order.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.beini.order.entity.Order;

public interface OrderService {
	/*查询*/
	Page<Order> findAll(Pageable pageable);
	Order findById(String id);
	/*更新*/
	Order save(Order bean);
	Order update(Order bean);
	void delete(String... id);
}
