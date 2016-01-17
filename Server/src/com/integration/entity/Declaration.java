package com.integration.entity;

public class Declaration {
	private int declare_id;
	private int customer_id;
	private int cash_num;
	private int pre_declare_id;

	public int getDeclareId() {
		return declare_id;
	}

	public void setDeclareId(int declare_id) {
		this.declare_id = declare_id;
	}

	public int getCustomerId() {
		return customer_id;
	}

	public void setCustomerId(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getCashNum() {
		return cash_num;
	}

	public void setCashNum(int cash_num) {
		this.cash_num = cash_num;
	}
	
	public int getPreDeclareId() {
		return pre_declare_id;
	}

	public void setPreDeclareId(int pre_declare_id) {
		this.pre_declare_id = pre_declare_id;
	}
}
