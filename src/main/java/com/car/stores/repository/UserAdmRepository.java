package com.car.stores.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car.stores.entity.Customer;

public interface UserAdmRepository extends JpaRepository<Customer,Long>
{

}
