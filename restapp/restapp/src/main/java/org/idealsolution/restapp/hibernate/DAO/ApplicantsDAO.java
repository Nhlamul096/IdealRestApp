package org.idealsolution.restapp.hibernate.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.idealsolution.restapp.hibernate.Entities.ApplicantEntity;

public class ApplicantsDAO {
	
	SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(ApplicantEntity.class)
            .buildSessionFactory();

	public List<ApplicantEntity> getApplicantsByJob(int jobId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<ApplicantEntity> applicantList;
		String sql  = "from applicants where jobId = '"+jobId+"'";
		applicantList = session.createQuery(sql).getResultList();
		return applicantList;
	}



}

}
