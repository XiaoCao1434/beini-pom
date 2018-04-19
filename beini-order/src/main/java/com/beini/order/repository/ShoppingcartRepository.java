package com.beini.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.order.entity.Shoppingcart;

public interface ShoppingcartRepository extends JpaRepository<Shoppingcart, Integer>, JpaSpecificationExecutor<Shoppingcart> {

}
