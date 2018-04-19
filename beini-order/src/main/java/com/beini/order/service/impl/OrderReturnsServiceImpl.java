package com.beini.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.order.entity.OrderReturns;
import com.beini.order.repository.OrderReturnsRepository;
import com.beini.order.service.OrderReturnsService;
@Service
public class OrderReturnsServiceImpl implements OrderReturnsService {
	@Autowired
	private OrderReturnsRepository repository;
	@Override
	public Page<OrderReturns> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public OrderReturns findById(String id) {
		return repository.findOne(id);
	}

	@Override
	public OrderReturns save(OrderReturns bean) {
		return repository.save(bean);
	}

	@Override
	public OrderReturns update(OrderReturns bean) {
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
