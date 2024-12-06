package com.jlcindia.hibernate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name="wstudents")
@PrimaryKeyJoinColumn(name = "mysid")
public class WeekdayStudent extends CurrentStudent{
	
 
	private int yearOfStudy;
    private int attendance;
    private String course;

    public WeekdayStudent() {}

    public WeekdayStudent(String sname, String email, int phone, int fee, String timings, String branch, int yearOfStudy, int attendance, String course) {
        super(sname, email, phone, fee, timings, branch);
        this.yearOfStudy = yearOfStudy;
        this.attendance = attendance;
        this.course = course;
    }

	public WeekdayStudent(int mysid, String sname, String email, int phone, int fee, String timings, String branch,
			int yearOfStudy, int attendance, String course) {
		super(mysid, sname, email, phone, fee, timings, branch);
		this.yearOfStudy = yearOfStudy;
		this.attendance = attendance;
		this.course = course;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "WeekdayStudent [yearOfStudy=" + yearOfStudy + ", attendance=" + attendance + ", course=" + course + "]";
	}

    // Getters and Setters
    

}
