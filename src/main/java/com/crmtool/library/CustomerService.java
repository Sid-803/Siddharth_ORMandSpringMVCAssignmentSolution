package com.crmtool.library;

import java.util.List;

import com.crmtool.library.Customer;

public interface CustomerService {
	public List<Customer> findAll();

	public Customer findById(int theId);

	public void save(Customer theCustomer);

	public void deleteById(int theId);

	public List<Customer> searchBy(String firstname, String lastname);
}
