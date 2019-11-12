package com.example.test;

//Javax imports to allow for Spring.io functionality
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Tags class as an entity for JPA 
@Entity
public class Organization {

	//Private fields of an Organization to maintain encapsulation/abstraction. Added Generated ID to make accessing individual elements easier.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;
	private String address;
	private String phone;
		
	//Utilizing Strings instead of Users due to both status 500 and typing error.
	private String[] members;

	//Standard Getters and Setters. Utilized by when adding elements to H2.
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String[] getMembers() {
		return members;
	}

	public void setMembers(String[] members) {
		this.members = members;
	}
	
}
