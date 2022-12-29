package com.car.stores.service;

import java.util.List;

import com.car.stores.entity.Cart;
import com.car.stores.entity.Customer;

public interface CartService {

	void saveCartItems(List<Cart> cartsItems);
	void saveCart(Cart cart);
	List<Cart> getCartItemsByCustomerId(Customer customer);
	void removeCartItems(Customer customer, Long id);
	void removeCartItem(Long id);
}
