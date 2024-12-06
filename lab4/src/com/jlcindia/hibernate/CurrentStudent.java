package com.jlcindia.hibernate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name="cstudents")
@PrimaryKeyJoinColumn(name = "mysid")
public class CurrentStudent extends Student{
	
 
	private int fee;
    private String timings;
    private String branch;

    public CurrentStudent() {}

    public CurrentStudent(String sname, String email, int phone, int fee, String timings, String branch) {
        super(sname, email, phone);
        this.fee = fee;
        this.timings = timings;
        this.branch = branch;
    }

	public CurrentStudent(int mysid, String sname, String email, int phone, int fee, String timings, String branch) {
		super(mysid, sname, email, phone);
		this.fee = fee;
		this.timings = timings;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "CurrentStudent [fee=" + fee + ", timings=" + timings + ", branch=" + branch + "]";
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

    // Getters and Setters
    
	
	 

}
