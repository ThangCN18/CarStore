package com.car.stores.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car.stores.entity.Contact;

public interface ContactAdmRepository extends JpaRepository<Contact, Long> 
{
	
}
