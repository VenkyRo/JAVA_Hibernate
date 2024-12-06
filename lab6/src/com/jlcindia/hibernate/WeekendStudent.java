package com.jlcindia.hibernate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;



@Entity 
@Table(name = "westudents") 
public class WeekendStudent extends CurrentStudent{
	
 
	private int workExperience;
    private String companyName;
    private String companyEmail;

    public WeekendStudent() {}

    public WeekendStudent(String sname, String email, int phone, int fee, String timings, String branch, int workExperience, String companyName, String companyEmail) {
        super(sname, email, phone, fee, timings, branch);
        this.workExperience = workExperience;
        this.companyName = companyName;
        this.companyEmail = companyEmail;
    }

	public WeekendStudent(int mysid, String sname, String email, int phone, int fee, String timings, String branch,
			int workExperience, String companyName, String companyEmail) {
		super(mysid, sname, email, phone, fee, timings, branch);
		this.workExperience = workExperience;
		this.companyName = companyName;
		this.companyEmail = companyEmail;
	}

	public int getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
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
		return "WeekendStudent [workExperience=" + workExperience + ", companyName=" + companyName + ", companyEmail="
				+ companyEmail + "]";
	}

    // Getters and Setters
    
	
	 

}
