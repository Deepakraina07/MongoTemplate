package com.samco.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee_Details")
public class Employee {

	private int id;
	private String name;
	private int age;
	private String domain;
	private Address address;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, int age, String domain, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.domain = domain;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
