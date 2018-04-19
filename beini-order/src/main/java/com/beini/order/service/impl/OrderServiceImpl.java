package com.beini.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.order.entity.Order;
import com.beini.order.repository.OrderRepository;
import com.beini.order.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
@Autowired
	private OrderRepository repository;
	@Override
	public Page<Order> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public Order findById(String id) {
		return repository.findOne(id);
	}

	@Override
	public Order save(Order bean) {
		return repository.save(bean);
	}

	@Override
	public Order update(Order bean) {
		return repository.save(bean);
	}

	@Override
	public void delete(String... id) {
		try {
			for(String str:id) {
				repository.delete(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
