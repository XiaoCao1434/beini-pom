package com.beini.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.order.entity.Shoppingcart;
import com.beini.order.repository.ShoppingcartRepository;
import com.beini.order.service.ShoppingcartService;
@Service
public class ShoppingcartServiceImpl implements ShoppingcartService{
	@Autowired
	private ShoppingcartRepository repository;
	@Override
	public Page<Shoppingcart> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public Shoppingcart findById(Integer id) {
		return repository.findOne(id);
	}

	@Override
	public Shoppingcart save(Shoppingcart bean) {
		return repository.save(bean);
	}

	@Override
	public Shoppingcart update(Shoppingcart bean) {
		return repository.save(bean);
	}

	@Override
	public void delete(Integer... id) {
		try {
			for(Integer str:id) {
				repository.delete(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
