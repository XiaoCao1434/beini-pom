package com.beini.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.order.entity.DeliveryAddress;

public interface DeliveryAddressRepository extends JpaSpecificationExecutor<DeliveryAddress>, JpaRepository<DeliveryAddress, String> {

}
