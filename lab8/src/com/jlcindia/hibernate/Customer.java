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
	 
	 @Column(name="myemail") 
	private String email; 
	 
	@Column(name="myphone") 
	private int phone; 
	 
	
	
	@OneToMany(mappedBy = "customer",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Accounts> accounts;

	
	public Customer() {}
	
	
	
	public Customer(int cid, String cname, String email, int phone, Set<Accounts> accounts) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.accounts = accounts;
	}
	
	



	public Customer(String cname, String email, int phone, Set<Accounts> accounts) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.accounts = accounts;
	}
	
	



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

	

	public Set<Accounts> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Accounts> accounts) {
		this.accounts = accounts;
	}



	@Override
	public String toString() {
	    return "Customer [cid=" + cid + ", cname=" + cname + ", myemail=" + email + ", myphone=" + phone + "]";
	}


	

	
	
	
}
