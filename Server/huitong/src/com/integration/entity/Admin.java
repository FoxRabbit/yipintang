package com.integration.entity;

public class Admin {
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
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
	public int getAdmin_role() {
		return admin_role;
	}
	public void setAdmin_role(int admin_role) {
		this.admin_role = admin_role;
	}
	public int getForm_role() {
		return form_role;
	}
	public void setForm_role(int form_role) {
		this.form_role = form_role;
	}
	public int getCash_role() {
		return cash_role;
	}
	public void setCash_role(int cash_role) {
		this.cash_role = cash_role;
	}
	public int getAccount_role() {
		return account_role;
	}
	public void setAccount_role(int account_role) {
		this.account_role = account_role;
	}
	public int getService_role() {
		return service_role;
	}
	public void setService_role(int service_role) {
		this.service_role = service_role;
	}
	private int user_id;
	private String username;
	private String password;
	private int admin_role;
	private int form_role;
	private int cash_role;
	private int account_role;
	private int service_role;
	

}
