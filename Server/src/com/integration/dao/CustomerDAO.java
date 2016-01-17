package com.integration.dao;
import java.util.List;
import com.integration.entity.Customer;
public interface CustomerDAO {
	public void saveCustomer(Customer customer);
	public List<Customer> findAllCustomers();
	public void removeCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public Customer findCustomerById(Integer id);
	public Customer loginCustomer(Customer customer);
}
