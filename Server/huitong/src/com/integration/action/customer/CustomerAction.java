package com.integration.action.customer;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.entity.Customer;
import com.integration.service.CustomerService;
@SuppressWarnings("serial")
public class CustomerAction extends ActionSupport {
	private Customer customer;
	private CustomerService customerService;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public CustomerService getCustomerService() {
		return customerService;
	}
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	@Override
	public String execute() throws Exception {

		return SUCCESS;
	}
	/*public String login() throws Exception {
		Customer customerLogin = customerService.loginCustomer(customer);
		if (customerLogin != null) {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			session.setAttribute("customer", customerLogin);
			return SUCCESS;
		}
		return INPUT;
	}
	public String loginOut() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.removeAttribute("customer");
		return INPUT;
	}*/
	public String customerUpdateInfo() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Customer customer = (Customer) session.getAttribute("customer");
		this.customer = this.customerService.findById(customer.getCustomer_id());
		return "customerUpdate";
	}
	public String updateCustomer() {
		this.customerService.update(customer);
		message = "修改信息成功。";
		return "updateSuc";
	}
}