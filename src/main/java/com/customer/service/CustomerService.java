package com.customer.service;

import com.customer.entity.Customer;

public interface CustomerService {

	// Fetch Customer By ID
	Customer getById(Integer customer_id);
}
