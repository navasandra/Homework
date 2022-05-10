package com.demo.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.model.Customer;
import com.demo.demo.service.CustomerService;

@RestController
public class CustomersController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public List<Customer> listCustomers(){
		return customerService.getCustomers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public void addCustomer(@Valid @RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
}
