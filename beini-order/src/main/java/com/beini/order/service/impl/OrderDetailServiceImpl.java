package com.beini.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.order.entity.OrderDetail;
import com.beini.order.repository.OrderDetailRepository;
import com.beini.order.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
	@Autowired
	private OrderDetailRepository repository;

	@Override
	public Page<OrderDetail> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public OrderDetail findById(String id) {
		return repository.findOne(id);
	}

	@Override
	public OrderDetail save(OrderDetail bean) {
		return repository.save(bean);
	}

	@Override
	public OrderDetail update(OrderDetail bean) {
		return repository.save(bean);
	}

	@Override
	public void delete(String... id) {
		try {
			for (String str : id) {
				repository.delete(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
