package com.aaa.model;

import java.util.Date;
import java.util.Set;

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
	private Customer customer;
	private Date tradedate;
	private String status;
	private Double amount;
	private Set<Orderitem> orderitems;//订单明细
	// Constructors

	public Set<Orderitem> getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(Set<Orderitem> orderitems) {
		this.orderitems = orderitems;
	}

	/** default constructor */
	public Orderform() {
	}

	/** full constructor */
	public Orderform(Customer customer, Date tradedate, String status, Double amount) {
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

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
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