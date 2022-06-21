package org.idealsolution.restapp.services;

import java.util.List;

import org.idealsolution.restapp.hibernate.DAO.ApplicantsDAO;
import org.idealsolution.restapp.hibernate.Entities.ApplicantEntity;


public class ApplicantsService {
	ApplicantsDAO dao = new ApplicantsDAO();

	public List<ApplicantEntity> getApplicantsByJob(int jobId) {
		List<ApplicantEntity> ApplicantList = dao.getApplicantsByJob(jobId);
		return ApplicantList;
	}
		

}


