package com.jlcindia.hibernate;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="authors")

public  class Author {
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "authorid")
	private int authorId; 
	 
	@Column(name = "authorame")
	private String authorName; 
	 
	@Column(name = "email")
	private String email; 
	 
	@Column(name = "phone")
	private long phone; 
	
	
	@ElementCollection 
	@CollectionTable(name="myskills",joinColumns = 
	@JoinColumn(name="authorId")) 
	@Column(name="skillName") 
	private Set<String> skills; 

	
	@ElementCollection 
	@CollectionTable(name="myqualis",joinColumns = 
	@JoinColumn(name="authorId")) 
	@OrderColumn(name="qorder") 
	@Column(name="qualis") 
	private List<String> qualifications; 
	
	@ElementCollection 
	@CollectionTable(name="myexps",joinColumns = 
	@JoinColumn(name="authorId")) 
	@MapKeyColumn(name="companyName") 
	@Column(name="yoe") 
	private Map<String,Integer> exps; 

	
	@ManyToMany(mappedBy = "myauthors") 
	private Set<Book> mybooks; 

	

	
	public Author() {}
	
	

	public Author(String authorName, String email, long phone, Set<String> skills, List<String> qualifications,
			Map<String, Integer> exps) {
		super();
		this.authorName = authorName;
		this.email = email;
		this.phone = phone;
		this.skills = skills;
		this.qualifications = qualifications;
		this.exps = exps;
	}







	public Author(int authorId, String authorName, String email, long phone, Set<String> skills,
			List<String> qualifications, Map<String, Integer> exps) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.email = email;
		this.phone = phone;
		this.skills = skills;
		this.qualifications = qualifications;
		this.exps = exps;
	}

	

	public int getAuthorId() {
		return authorId;
	}



	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}



	public String getAuthorName() {
		return authorName;
	}



	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getPhone() {
		return phone;
	}



	public void setPhone(long phone) {
		this.phone = phone;
	}



	public Set<String> getSkills() {
		return skills;
	}



	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}



	public List<String> getQualifications() {
		return qualifications;
	}



	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}



	public Map<String, Integer> getExps() {
		return exps;
	}



	public void setExps(Map<String, Integer> exps) {
		this.exps = exps;
	}



	public Set<Book> getMybooks() {
		return mybooks;
	}



	public void setMybooks(Set<Book> mybooks) {
		this.mybooks = mybooks;
	}

	
	


	@Override 
	public String toString() { 
	return authorId + "\t" + authorName + "\t" + email + 
	"\t" + phone ; 
	} 


	
	
	
}
