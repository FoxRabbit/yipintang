package com.integration.entity;

public class Admin {
	private int user_id;
	private String username;
	private String password;
	private int admin_role;
	private int form_role;
	private int cash_role;
	private int account_role;
	private int service_role;
	
	public int getAdminid() {
		return user_id;
	}

	public void setAdminid(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAdminRole() {
		return admin_role;
	}

	public void setAdminRole(int admin_role) {
		this.admin_role = admin_role;
	}
	
	public int getFormRole() {
		return form_role;
	}

	public void setFormRole(int form_role) {
		this.form_role = form_role;
	}
	
	public int getCashRole() {
		return cash_role;
	}

	public void setCashRole(int cash_role) {
		this.cash_role = cash_role;
	}
	
	public int getAccountRole() {
		return account_role;
	}

	public void setAccountRole(int account_role) {
		this.account_role = account_role;
	}
	
	public int getServiceRole() {
		return service_role;
	}

	public void setServiceRole(int service_role) {
		this.service_role = service_role;
	}
}
