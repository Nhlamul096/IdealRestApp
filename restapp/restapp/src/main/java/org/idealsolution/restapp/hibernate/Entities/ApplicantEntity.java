package org.idealsolution.restapp.hibernate.Entities;

public class ApplicantEntity {
	@Id
	@Column(name="ApplicantId")
	String ApplicantId;
	
	@ManyToOne
	@Column(name="jobId")
	int jobId;
	
	@Column(name="applicantName")
	String applicantName;
	
	@Column(name="gender")
	String gender;
	
	@Column(name="applicantSurname")
	String applicantSurname;
	
	@column(name="email")
	String email;
	
	@column("age")
	int age;
	
	public ProductEntity() {
		
	}
	

}
