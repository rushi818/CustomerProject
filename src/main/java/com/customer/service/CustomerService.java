package com.customer.service;

import com.customer.dto.GetCustomerRequest;
import com.customer.dto.GetCustomerResponse;
import com.customer.entity.Customer;

public interface CustomerService {

	// Fetch Customer By ID
	public Customer getById(Integer customer_id);

	// Add Customers
	public Customer addCustomer(Customer customer);

	// Fetch customer details using DTO (Request and Response)
	public GetCustomerResponse getCustomerInfo(GetCustomerRequest id);

	// Delete CustomerData By ID
	public void deleteById(Integer customer_id);
}
