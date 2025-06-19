package com.customer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;
import com.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	// Fetch Customer By ID
	@Override
	public Customer getById(Integer customer_id) {
		return customerRepository.findByCustomerId(customer_id);

	}

}
