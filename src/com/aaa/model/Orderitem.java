package com.aaa.model;

/**
 * Orderitem entity. @author MyEclipse Persistence Tools
 */

public class Orderitem implements java.io.Serializable {

	// Fields

	@Override
	public String toString() {
		return "Orderitem [id=" + id + ", orderid=" + orderid + ", commodity=" + commodity + ", discount=" + discount
				+ ", actprice=" + actprice + ", amount=" + amount + "]";
	}

	private Integer id;
	private Integer orderid;
	private Integer commodity;
	private Double discount;
	private Double actprice;
	private Double amount;

	// Constructors

	/** default constructor */
	public Orderitem() {
	}

	/** full constructor */
	public Orderitem(Integer orderid, Integer commodity, Double discount, Double actprice, Double amount) {
		this.orderid = orderid;
		this.commodity = commodity;
		this.discount = discount;
		this.actprice = actprice;
		this.amount = amount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Integer getCommodity() {
		return this.commodity;
	}

	public void setCommodity(Integer commodity) {
		this.commodity = commodity;
	}

	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getActprice() {
		return this.actprice;
	}

	public void setActprice(Double actprice) {
		this.actprice = actprice;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}