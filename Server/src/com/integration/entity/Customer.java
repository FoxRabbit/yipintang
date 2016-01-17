package com.integration.entity;

public class Customer {
	private int customer_id;

	private String customername;

	private String identity_card;
	
	private String bank_card;
	
	private String mobile;

	private String email;

	public int getCustomerid() {
		return customer_id;
	}

	public void setCustomerid(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getIdentityCard() {
		return identity_card;
	}

	public void setIdentityCard(String identity_card) {
		this.identity_card = identity_card;
	}
	
	public String getBankCard() {
		return bank_card;
	}

	public void setBankCard(String bank_card) {
		this.bank_card = bank_card;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
