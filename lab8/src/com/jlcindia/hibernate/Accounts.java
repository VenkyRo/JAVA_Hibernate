package com.jlcindia.hibernate;

import javax.persistence.*;

@Entity
@Table(name="myaccounts")
public class Accounts {
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 @Column(name="accno") 
	private int accno; 
	 
	 @Column(name="atype") 
	private String atype; 
	 
	 @Column(name="bcode") 
	private String bcode; 
	 
	@Column(name="bal") 
	private double bal; 
	 
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "mycid",referencedColumnName = "cid")
	private Customer customer;

	public Accounts() {
		
	}

	public Accounts(int accno, String atype, String bcode, double bal, Customer customer) {
		super();
		this.accno = accno;
		this.atype = atype;
		this.bcode = bcode;
		this.bal = bal;
		this.customer = customer;
	}

	public Accounts(String atype, String bcode, double bal, Customer customer) {
		super();
		this.atype = atype;
		this.bcode = bcode;
		this.bal = bal;
		this.customer = customer;
	}

	public Accounts(int accno, String atype, String bcode, double bal) {
		super();
		this.accno = accno;
		this.atype = atype;
		this.bcode = bcode;
		this.bal = bal;
	}

	public Accounts(String atype, String bcode, double bal) {
		super();
		this.atype = atype;
		this.bcode = bcode;
		this.bal = bal;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
	    return "Accounts [accno=" + accno + ", atype=" + atype + ", bal=" + bal + ", bcode=" + bcode + "]";
	}

	
	
	
	
	
	
}
