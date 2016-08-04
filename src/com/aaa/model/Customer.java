package com.aaa.model;

import java.util.Date;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", tel=" + tel + ", address=" + address + ", email=" + email
				+ ", sex=" + sex + ", description=" + description + ", age=" + age + ", birthday=" + birthday + "]";
	}

	private Integer id;
	private String name;
	private String tel;
	private String address;
	private String email;
	private String sex;
	private String description;
	private Integer age;
	private Date birthday;

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** full constructor */
	public Customer(String name, String tel, String address, String email, String sex, String description, Integer age,
			Date birthday) {
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.email = email;
		this.sex = sex;
		this.description = description;
		this.age = age;
		this.birthday = birthday;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}