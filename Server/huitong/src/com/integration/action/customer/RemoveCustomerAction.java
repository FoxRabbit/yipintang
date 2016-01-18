package com.integration.action.customer;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.entity.Customer;
import com.integration.service.CustomerService;
@SuppressWarnings("serial")
public class RemoveCustomerAction extends ActionSupport {
	private Customer customer;
	private CustomerService service;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public CustomerService getService() {
		return service;
	}
	public void setService(CustomerService service) {
		this.service = service;
	}
	@Override
	public String execute() throws Exception {
		this.service.delete(customer);
		return SUCCESS;
	}
}