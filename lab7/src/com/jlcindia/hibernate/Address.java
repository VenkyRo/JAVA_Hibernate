package com.jlcindia.hibernate;

import javax.persistence.*;



@Entity
@Table(name="myaddress")
public class Address {
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 @Column(name="addId") 
	private int cid; 
	 
	 @Column(name="street")
	private String street; 
	 
	 @Column(name="city") 
	private String city; 
	 
	@Column(name="state") 
	private String state;

	public Address() {
		
	}

	public Address(int cid, String street, String city, String state) {
		super();
		this.cid = cid;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [cid=" + cid + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
}
