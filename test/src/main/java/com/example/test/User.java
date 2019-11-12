package com.example.test;

import java.util.ArrayList;

//Javax imports to allow for Spring.io functionality
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Tags class as an entity for JPA 
@Entity
public class User {

	//Private fields of an Organization to maintain encapsulation/abstraction. Added Generated ID to make accessing individual elements easier.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private Long phone;
	
	//Utilizing Strings instead of Organizations due to both status 500 and typing error.
	private ArrayList<String> memberOf;
	
	//Standard Getters and Setters. Utilized when adding elements to H2.
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public ArrayList<String> getMemberOf() {
		return memberOf;
	}
	public void setMemberOf(ArrayList<String> memberOf) {
		this.memberOf = memberOf;
	}

	
	
	
}
