package com.aaa.model;

/**
 * Seller entity. @author MyEclipse Persistence Tools
 */

public class Seller implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String tel;
	private String address;
	private String website;
	private Integer star;
	private String business;

	// Constructors

	/** default constructor */
	public Seller() {
	}

	/** full constructor */
	public Seller(String name, String tel, String address, String website, Integer star, String business) {
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.website = website;
		this.star = star;
		this.business = business;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Integer getStar() {
		return this.star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	public String getBusiness() {
		return this.business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", tel=" + tel + ", address=" + address + ", website=" + website
				+ ", star=" + star + ", business=" + business + "]";
	}

}