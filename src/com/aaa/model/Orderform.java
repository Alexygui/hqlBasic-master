package com.aaa.model;

import java.util.Date;

/**
 * Orderform entity. @author MyEclipse Persistence Tools
 */

public class Orderform implements java.io.Serializable {

	// Fields

	@Override
	public String toString() {
		return "Orderform [id=" + id + ", customer=" + customer + ", tradedate=" + tradedate + ", status=" + status
				+ ", amount=" + amount + "]";
	}

	private Integer id;
	private Integer customer;
	private Date tradedate;
	private String status;
	private Double amount;

	// Constructors

	/** default constructor */
	public Orderform() {
	}

	/** full constructor */
	public Orderform(Integer customer, Date tradedate, String status, Double amount) {
		this.customer = customer;
		this.tradedate = tradedate;
		this.status = status;
		this.amount = amount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Integer customer) {
		this.customer = customer;
	}

	public Date getTradedate() {
		return this.tradedate;
	}

	public void setTradedate(Date tradedate) {
		this.tradedate = tradedate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}