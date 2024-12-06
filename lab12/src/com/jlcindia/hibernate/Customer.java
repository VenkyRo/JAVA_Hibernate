package com.jlcindia.hibernate;

import javax.persistence.*;

@Entity
@Table(name="mycustomers1")
public class Customer {
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 @Column(name="cid") 
	private int cid; 
	 
	 @Column(name="cname") 
	private String cname; 
	 
	 @Column(name="myemail") 
	private String email; 
	 
	@Column(name="myphone") 
	private int phone; 
	 
	@Column(name="mycity") 
	private String city; 
	
	@Version
	private int version;

	
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
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ "]";
	}

	
	
	
}
