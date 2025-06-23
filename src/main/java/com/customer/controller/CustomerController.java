package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.dto.GetCustomerRequest;
import com.customer.dto.GetCustomerResponse;
import com.customer.entity.Customer;
import com.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// Fetching Customer By ID
	@GetMapping("/get/{customer_id}")
	private Customer getById(@PathVariable("customer_id") Integer customer_id) {
		return customerService.getById(customer_id);

	}

	// Add Customers to DB
	@PostMapping("/save")
	private Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}

	// Learning GET operation about DTO
	@GetMapping("/get/info")
	private ResponseEntity<GetCustomerResponse> getCustomerInfo(@RequestBody GetCustomerRequest request) {
		GetCustomerResponse response = customerService.getCustomerInfo(request);

		return ResponseEntity.ok(response);
	}

	// Delete CustomerData By ID
	@DeleteMapping("/delete/{customer_id}")
	private void deleteById(@PathVariable("customer_id") Integer customer_id) {
		customerService.deleteById(customer_id);

	}
}
