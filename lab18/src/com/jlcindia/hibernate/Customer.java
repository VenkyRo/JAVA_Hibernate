package com.jlcindia.hibernate;

import javax.persistence.*;


@Entity
@Table(name="mycustomers7")

public class Customer {
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Basic
	private int cid; 
	 
	 @Basic(optional = true)
	private String cname; 
	 
	 @Basic(optional = false,fetch = FetchType.LAZY)
	private String email; 
	 
	 @Basic(optional = false,fetch = FetchType.LAZY)
	private int phone; 
	 
	 @Basic(optional = false,fetch = FetchType.LAZY)
	private String city; 
	
	

	
	public Customer() {}
	
	public Customer( String cname, String email, int phone, String city) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}
	
	public Customer(int cid, String cname, String email, int phone, String city) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override 
	public String toString() { 
	return cid + "\t" + cname + "\t" + email + "\t" + phone+ 
	"\t" + city; 
	} 


	
	
	
}
