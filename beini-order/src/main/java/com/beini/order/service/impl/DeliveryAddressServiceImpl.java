package com.beini.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.order.entity.DeliveryAddress;
import com.beini.order.repository.DeliveryAddressRepository;
import com.beini.order.service.DeliveryAddressService;
@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {
	@Autowired
	private DeliveryAddressRepository repository;
	@Override
	public Page<DeliveryAddress> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public DeliveryAddress findById(String id) {
		return repository.findOne(id);
	}

	@Override
	public DeliveryAddress save(DeliveryAddress bean) {
		return repository.save(bean);
	}

	@Override
	public DeliveryAddress update(DeliveryAddress bean) {
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
