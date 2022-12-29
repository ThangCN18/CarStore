package com.car.stores.service.Impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.stores.entity.Customer;
import com.car.stores.repository.UserAdmRepository;
import com.car.stores.service.UserAdmService;

@Service
@Transactional
public class UserAdmServiceImpl implements UserAdmService
{
	@Autowired
	UserAdmRepository userAdmRepo;

	@Override
	public Optional<Customer> getCustomerId(Long pid)
	{
		
		return userAdmRepo.findById(pid);
	}

	@Override
	public List<Customer> getAllCustomer()
	{

		return userAdmRepo.findAll();
	}

	@Override
	public void deleteCustomer(Long pid) 
	{
		userAdmRepo.deleteById(pid);
		
	}

	@Override
	public void deleteAll(List<Customer> ids) 
	{
		
		
	}
	
}
