package com.demo.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.demo.model.Customer;

@Service
public class CustomerService {
	
	 ArrayList<Customer> customerList = new ArrayList<Customer>(Arrays.asList(
			new Customer("Vardenis", "Pavardenis", "1992-01-02", "869898989", "email@email.com"),
			new Customer("Pavardenis", "Vardenis", "1990-08-21", "860000000", "email@gmail.com")));
	
	public List<Customer> getCustomers(){
		return customerList;
	}
	
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}

}
