package com.jlcindia.hibernate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;



@Entity 
@Table(name = "ostudents") 
@PrimaryKeyJoinColumn(name = "mysid") 
public class OldStudent extends Student{
	
 
	private int totalFees;
    private String companyName;
    private String companyEmail;

    public OldStudent() {}

    public OldStudent(String sname, String email, int phone, int totalFees, String companyName, String companyEmail) {
        super(sname, email, phone);
        this.totalFees = totalFees;
        this.companyName = companyName;
        this.companyEmail = companyEmail;
    }

	public OldStudent(int mysid, String sname, String email, int phone, int totalFees, String companyName,
			String companyEmail) {
		super(mysid, sname, email, phone);
		this.totalFees = totalFees;
		this.companyName = companyName;
		this.companyEmail = companyEmail;
	}

	public int getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(int totalFees) {
		this.totalFees = totalFees;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	@Override
	public String toString() {
		return "OldStudent [totalFees=" + totalFees + ", companyName=" + companyName + ", companyEmail=" + companyEmail
				+ "]";
	}

    // Getters and Setters
    
    

	

	
	

}
