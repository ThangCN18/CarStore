package com.car.stores.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car.stores.entity.Product;

public interface ProductAdmRepository extends JpaRepository<Product, Long> {
}
