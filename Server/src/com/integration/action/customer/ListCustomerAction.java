package com.integration.action.customer;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.service.CustomerService;
@SuppressWarnings("serial")
public class ListCustomerAction extends ActionSupport {
	private CustomerService service;

	public CustomerService getService() {
		return service;
	}
	public void setService(CustomerService service) {
		this.service = service;
	}
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list", this.service.findAll());
		return SUCCESS;
	}
}