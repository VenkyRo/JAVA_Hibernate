package com.jlcindia.hibernate;

import javax.persistence.*;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="mycustomers6")

public class Customer {
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 @Column(name = "cid")
	private int cid; 
	 
	 @Column(name = "cname")
	private String cname; 
	 
	 @Column(name = "email")
	private String email; 
	 
	@Column(name = "myphone")
	private int phone; 
	 
	
	
	@Embedded 
	@AttributeOverrides({ 
	@AttributeOverride(name= "street" 
	,column=@Column(name="mystreet")), 
	@AttributeOverride(name= "city" 
	,column=@Column(name="mycity")), 
	@AttributeOverride(name= "state" 
	,column=@Column(name="mystate")) 
	}) 
	private Address address; 

	
	

	
	public Customer() {}
	
	public Customer( String cname, String email, int phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		
	}
	
	public Customer(int cid, String cname, String email, int phone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		
	}
	
	

	public Customer(String cname, String email, int phone, Address address) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		
		this.address = address;
	}

	public Customer(int cid, String cname, String email, int phone, String city, Address address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		
		this.address = address;
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

	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override 
	public String toString() { 
	return cid + "\t" + cname + "\t" + email + "\t" + 
	phone+"\t"+address.toString(); 
	} 


	
	
	
}
