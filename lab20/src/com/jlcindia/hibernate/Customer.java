package com.jlcindia.hibernate;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="mycustomers")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Customer {
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "cid")
	private int cid; 
	 
	@Column(name = "cname")
	private String cname; 
	 
	@Column(name = "email")
	private String email; 
	 
	@Column(name = "phone")
	private long phone; 
	 
	@Column(name = "dob")
	private Date dob; 
	
	

	
	public Customer() {}
	
	
	
	
	

	public Customer(String cname, String email, long phone, Date dob) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}






	public Customer(int cid, String cname, String email, long phone, Date dob) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
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






	public long getPhone() {
		return phone;
	}






	public void setPhone(int phone) {
		this.phone = phone;
	}






	public Date getDob() {
		return dob;
	}






	public void setDob(Date dob) {
		this.dob = dob;
	}






	@Override 
	public String toString() { 
	return cid + "\t" + cname + "\t" + email + "\t" + phone+ 
	"\t" + dob; 
	} 


	
	
	
}
