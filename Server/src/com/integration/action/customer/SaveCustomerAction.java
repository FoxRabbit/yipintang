package com.integration.action.customer;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.entity.Customer;
import com.integration.service.CustomerService;
@SuppressWarnings("serial")
public class SaveCustomerAction extends ActionSupport {
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
		// 调用service相关的方法，完成实际的业务处理
		this.service.save(this.customer);
		return SUCCESS;
	}
	public String register() throws Exception {
		// 调用service相关的方法，完成实际的业务处理
		this.service.save(this.customer);
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("customer", this.customer);
		return "regSuc";
	}
}