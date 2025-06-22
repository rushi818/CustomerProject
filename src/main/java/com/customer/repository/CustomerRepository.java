package com.customer.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.customer.dto.GetCustomerRequest;
import com.customer.dto.GetCustomerResponse;
import com.customer.entity.Customer;

@Repository
@EnableJpaRepositories
public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

	public Customer findByCustomerId(Integer customerId);

}
