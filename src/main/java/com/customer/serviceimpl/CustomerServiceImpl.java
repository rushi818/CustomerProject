package com.customer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dto.GetCustomerRequest;
import com.customer.dto.GetCustomerResponse;
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

	// Fetch Customer details using DTO (Request and Response)
	@Override
	public Customer addCustomer(Customer customer) {

		return customerRepository.save(customer);

	}

	@Override
	public GetCustomerResponse getCustomerInfo(GetCustomerRequest request) {

		Customer customer = customerRepository.findByCustomerId(request.getCustomerId());

		GetCustomerResponse customerResponse = new GetCustomerResponse();

		customerResponse.setFirstName(customer.getFirstName());
		customerResponse.setLastName(customer.getLastName());
		customerResponse.setAddress(customer.getAddress());

		return customerResponse;
	}

	@Override
	public void deleteById(Integer customer_id) {
		customerRepository.deleteById(customer_id);

	}

}
