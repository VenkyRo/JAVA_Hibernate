package com.jlcindia.hibernate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name="mystudents")
public class Student {
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 @Column(name="sid") 
	private int cid; 
	 
	 @Column(name="sname") 
	private String cname; 
	 
	 @Column(name="email") 
	private String email; 
	 
	@Column(name="phone") 
	private int phone; 
	 
	@Column(name="city") 
	private String city; 

	@ElementCollection
	@CollectionTable(name = "studentCourses",joinColumns = @JoinColumn(name = "sid"))
	@OrderColumn(name = "learningOrder")
	@Column(name = "CourseName")
	private String[] course;
	
	@ElementCollection
	@CollectionTable(name = "studentSkills",joinColumns = @JoinColumn(name = "sid"))
	@OrderColumn(name = "SkillsOrder")
	@Column(name = "Skills")
	private List<String>skill;
	
	@ElementCollection
	@CollectionTable(name = "studentMarks",joinColumns = @JoinColumn(name = "sid"))
	@Column(name = "marks")
	private List<Integer> marks;
	
	@ElementCollection
	@CollectionTable(name = "studentInterviews",joinColumns = @JoinColumn(name ="sid"))
	@Column(name = "CompanyName")
	private Set<String> inteview;
	
	
	
	
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public List<String> getSkill() {
		return skill;
	}

	public void setSkill(List<String> skill) {
		this.skill = skill;
	}
	
	
	
	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<String> getInteview() {
		return inteview;
	}

	public void setInteview(Set<String> inteview) {
		this.inteview = inteview;
	}

	

	public Student(int cid, String cname, String email, int phone, String city, String[] course, List<String> skill,
			List<Integer> marks, Set<String> inteview, Map<String, Integer> referneces) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.course = course;
		this.skill = skill;
		this.marks = marks;
		this.inteview = inteview;
		
	}

	public Student() {}

	public Student( String cname, String email, int phone, String city) {
		
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		
	}
	
	

	@Override
	public String toString() {
		return "Student [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ ", course=" + Arrays.toString(course) + ", skill=" + skill + ", marks=" + marks + ", inteview="
				+ inteview + ", referneces=" +  "]";
	}

	

}
