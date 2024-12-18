package com.jlcindia.hibernate;

import javax.persistence.*;

import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="bankCustomers")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Customer {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "cid")
	private int cid; 
	 
	 @Column(name = "cname")
	private String cname; 
	 
	 @Column(name = "email")
	private String email; 
	 
	 @Column(name="city") 
	 private String city; 
	 @Column(name="balance") 
	 private double balance; 
	 @Column(name="accType") 
	 private String accType; 
	 @Column(name="status") 
	 private String status; 

	
	public Customer() {}


	public Customer(int cid, String cname, String email, String city, double balance, String accType, String status) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.city = city;
		this.balance = balance;
		this.accType = accType;
		this.status = status;
	}


	public Customer(String cname, String email, String city, double balance, String accType, String status) {
		super();
		this.cname = cname;
		this.email = email;
		this.city = city;
		this.balance = balance;
		this.accType = accType;
		this.status = status;
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getAccType() {
		return accType;
	}


	public void setAccType(String accType) {
		this.accType = accType;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override 
	public String toString() { 
	return cid + "\t" + cname + "\t" + email + "\t" + city+ "\t" + balance+ "\t" + accType+ "\t" + 
	status ; 
	}
	
	
	
	
}
