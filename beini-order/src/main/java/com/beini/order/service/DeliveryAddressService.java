package com.beini.order.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.beini.order.entity.DeliveryAddress;


public interface DeliveryAddressService {
	/*查询*/
	Page<DeliveryAddress> findAll(Pageable pageable);
	DeliveryAddress findById(String id);
	/*更新*/
	DeliveryAddress save(DeliveryAddress bean);
	DeliveryAddress update(DeliveryAddress bean);
	void delete(String... id);
}
