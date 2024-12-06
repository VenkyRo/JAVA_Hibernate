package com.jlcindia.hibernate;

import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name="mycustomers")
public class Customer {
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 @Column(name="cid") 
	private int cid; 
	 
	 @Column(name="cname") 
	private String cname; 
	 
	 @Column(name="email") 
	private String email; 
	 
	@Column(name="phone") 
	private int phone;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL) 
	@JoinColumn(name="myaddId") 
	private Address address; 
	
	
	
	
	public Customer(String cname, String email, int phone, Address address) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public Customer(int cid, String cname, String email, int phone, Address address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer() {}

	public Customer(int cid, String cname, String email, int phone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}

	public Customer(String cname, String email, int phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
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

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + "]";
	}

	
	
	
	
	
	
	
	
	 
	

	
	
	
}
