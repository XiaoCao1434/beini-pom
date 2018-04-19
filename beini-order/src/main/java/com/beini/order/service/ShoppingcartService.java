package com.beini.order.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.beini.order.entity.Shoppingcart;


public interface ShoppingcartService {
	/*查询*/
	Page<Shoppingcart> findAll(Pageable pageable);
	Shoppingcart findById(Integer id);
	/*更新*/
	Shoppingcart save(Shoppingcart bean);
	Shoppingcart update(Shoppingcart bean);
	void delete(Integer... id);
}
