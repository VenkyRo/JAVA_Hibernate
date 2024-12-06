
package com.jlcindia.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "myaccounts1")
@IdClass(AccountNumber.class)
public class Account {
	
	@Id
	@Column(name = "branchCode")
	private int branchCode;
	
	@Id
	@Column(name = "acctype")
	private String acctype;
	
	@Id
	@Column(name = "accId")
	private int accId;
	@Column(name = "accOpenDate")
	private Date accOpenDate;
	@Column(name = "balance")
	private Double balance;
	@Column(name = "status")
	private String status;
	public Account(int branchCode, String acctype, int 
			accId, Date accOpenDate, double balance, String 
			status) { 
			super(); 
			this.branchCode = branchCode; 
			this.acctype = acctype; 
			this.accId = accId; 
			this.accOpenDate = accOpenDate; 
			this.balance = balance; 
			this.status = status; 
			} 
	public Account() {
}
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public Date getAccOpenDate() {
		return accOpenDate;
	}
	public void setAccOpenDate(Date accOpenDate) {
		this.accOpenDate = accOpenDate;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override 
	public String toString() { 
	return branchCode + "\t" + acctype + "\t" + accId + "\t" + 
	accOpenDate + "\t" + balance + "\t" + status; 
	} 

	
	
	
	
}
