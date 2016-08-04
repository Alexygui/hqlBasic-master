package com.aaa.model;

/**
 * Commodity entity. @author MyEclipse Persistence Tools
 */

public class Commodity implements java.io.Serializable {

	// Fields

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", price=" + price + ", unit=" + unit + ", category="
				+ category + ", description=" + description + ", seller=" + seller + "]";
	}

	private Integer id;
	private String name;
	private Double price;
	private String unit;
	private String category;
	private String description;
	private Seller seller;

	// Constructors

	/** default constructor */
	public Commodity() {
	}

	/** full constructor */
	public Commodity(String name, Double price, String unit, String category, String description, Seller seller) {
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.category = category;
		this.description = description;
		this.seller = seller;
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

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

}