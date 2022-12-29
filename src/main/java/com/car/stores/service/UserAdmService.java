package com.car.stores.service;

import java.util.List;
import java.util.Optional;
import com.car.stores.entity.Customer;

public interface UserAdmService
{
	public Optional<Customer> getCustomerId(Long pid);
	public List<Customer> getAllCustomer();
	public void deleteCustomer(Long pid);
	public void deleteAll(List<Customer> ids);
}
