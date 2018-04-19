package com.beini.order.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.beini.order.entity.OrderReturns;

public interface OrderReturnsService {
	/*查询*/
	Page<OrderReturns> findAll(Pageable pageable);
	OrderReturns findById(String id);
	/*更新*/
	OrderReturns save(OrderReturns bean);
	OrderReturns update(OrderReturns bean);
	void delete(String... id);
}
