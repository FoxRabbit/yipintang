package com.integration.service;
import java.util.List;
import com.integration.entity.Customer;
public interface CustomerService {
	public void save(Customer customer);
	public List<Customer> findAll();
	public void delete(Customer customer);
	public void update(Customer customer);
	public Customer findById(Integer id);
}
