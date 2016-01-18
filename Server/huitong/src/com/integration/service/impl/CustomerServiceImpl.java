package com.integration.service.impl;
import java.util.List;
import com.integration.entity.Customer;
import com.integration.dao.CustomerDAO;
import com.integration.service.CustomerService;
public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO customerDao;
	public CustomerDAO getCustomerDao() {
		return customerDao;
	}
	public void setCustomerDao(CustomerDAO customerDao) {
		this.customerDao = customerDao;
	}
	public void save(Customer customer) {
		this.customerDao.saveCustomer(customer); // 完成真正的业务逻辑
	}
	public List<Customer> findAll() {
		return this.customerDao.findAllCustomers();
	}
	public void delete(Customer customer) {
		this.customerDao.removeCustomer(customer);
	}
	public void update(Customer customer) {
		this.customerDao.updateCustomer(customer);
	}
	public Customer findById(Integer id) {
		return this.customerDao.findCustomerById(id);
	}
}