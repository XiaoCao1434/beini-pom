package com.beini.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.order.entity.OrderLogistics;
import com.beini.order.repository.OrderLogisticsRepository;
import com.beini.order.service.OrderLogisticsService;

@Service
public class OrderLogisticsServiceImpl implements OrderLogisticsService {
	@Autowired
	private OrderLogisticsRepository repository;

	@Override
	public Page<OrderLogistics> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public OrderLogistics findById(String id) {
		return repository.findOne(id);
	}

	@Override
	public OrderLogistics save(OrderLogistics bean) {
		return repository.save(bean);
	}

	@Override
	public OrderLogistics update(OrderLogistics bean) {
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
