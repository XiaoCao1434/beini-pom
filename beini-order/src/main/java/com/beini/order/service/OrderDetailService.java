package com.beini.order.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.beini.order.entity.OrderDetail;

public interface OrderDetailService {
	/*查询*/
	Page<OrderDetail> findAll(Pageable pageable);
	OrderDetail findById(String id);
	/*更新*/
	OrderDetail save(OrderDetail bean);
	OrderDetail update(OrderDetail bean);
	void delete(String... id);
}
