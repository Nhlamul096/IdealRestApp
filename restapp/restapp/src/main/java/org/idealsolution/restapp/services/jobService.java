package org.idealsolution.restapp.services;

import java.util.List;

import org.idealsolution.restapp.hibernate.DAO.JobDAO;
import org.idealsolution.restapp.hibernate.Entities.JobEntity;

public class jobService {
	
	JobDAO DAO = new  JobDAO();

	public List<JobEntity> getJobs() {
		List<JobEntity> list = DAO.getJob();
		return list;
	}

	public void addJob(JobEntity job) {
		DAO.addJob(job);
		
	}

	public void updateJob(JobEntity updatedJob) {
		DAO.updateJob(updatedJob);
		
	}

	public void deleteJob(int jobId) {
		DAO.deleteJob(jobId);
		
	}

	 


}
