package com.integration.dao.impl;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.integration.entity.Customer;
import com.integration.dao.CustomerDAO;
public class CustomerDAOImpl extends HibernateDaoSupport implements CustomerDAO {
	public void saveCustomer(Customer customer) {
		this.getHibernateTemplate().save(customer);
	}
	@SuppressWarnings("unchecked")
	public List<Customer> findAllCustomers() {
		String hql = "from Customer customer order by customer.customerid desc";
		return (List<Customer>) this.getHibernateTemplate().find(hql);
	}
	public void removeCustomer(Customer customer) {
		this.getHibernateTemplate().delete(customer);
	}
	public void updateCustomer(Customer customer) {
		this.getHibernateTemplate().update(customer);
	}
	public Customer findCustomerById(Integer id) {
		Customer customer = (Customer) this.getHibernateTemplate().get(Customer.class, id);

		return customer;
	}
	@SuppressWarnings("unchecked")
	public Customer loginCustomer(Customer customer) {
		String hql = "from Customer customer where customer.customername='"
				+ customer.getCustomername() + "'";
		List<Customer> customers = (List<Customer>) this.getHibernateTemplate().find(hql);
		if (customers.size() > 0) {
			return customers.get(0);
		}
		return null;
	}
}
