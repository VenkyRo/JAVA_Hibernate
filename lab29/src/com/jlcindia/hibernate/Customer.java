package com.jlcindia.hibernate;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name="customers1")

public class Customer {
	
	@Id
    @GeneratedValue(generator = "cid-gen")
    @GenericGenerator(name = "cid-gen", strategy = "com.jlcindia.hibernate.CIDGenerator")
    @Column(name = "cid")
    private String cid;
	 
	 @Column(name = "cname")
	private String cname; 
	 
	 @Column(name = "email")
	private String email; 
	 
	@Column(name = "myphone")
	private int phone; 
	 
	
	
	
	
	

	
	public Customer() {}
	
	public Customer( String cname, String email, int phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		
	}
	
	public Customer(String cid, String cname, String email, int phone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		
	}
	
	

	
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
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
	return cid + "\t" + cname + "\t" + email + "\t" + 
	phone+"\t";
	} 


	
	
	
}
