package org.idealsolution.restapp.hibernate.Entities;
@Entity(name="jobs")
@Table(name="jobs")
public class JobEntity {
	@Id
	@coloumnn(name="jobId")
	int jobId;
	
	@coloumn(name="jobTitle")
	String jobTitle;
	public JobEntity() {
		
	}
	public JobEntity(int jobId, String jobTitle) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
