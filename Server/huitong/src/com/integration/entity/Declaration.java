package com.integration.entity;

public class Declaration {
	public int getDeclare_id() {
		return declare_id;
	}

	public void setDeclare_id(int declare_id) {
		this.declare_id = declare_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getCash_num() {
		return cash_num;
	}

	public void setCash_num(int cash_num) {
		this.cash_num = cash_num;
	}

	public int getPre_declare_id() {
		return pre_declare_id;
	}

	public void setPre_declare_id(int pre_declare_id) {
		this.pre_declare_id = pre_declare_id;
	}

	private int declare_id;
	private int customer_id;
	private int cash_num;
	private int pre_declare_id;

}
