package org.idealsolution.restapp.hibernate.DAO;

import java.util.List;

import org.idealsolution.restapp.hibernate.Entities.JobEntity;

public class JobDAO {
	
	SessionFactory factory = new Configuration()
			                       .configure("hibernate.cfg.xml")
			                       .addAnnotatedClass(JobEntity.class)
                                   .buildSessionFactory(); 
	public List<JobEntity> getJob() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<JobEntity> list =session.createQuery("from jobs").getResultList();
		return list;
	}

	public void addJob(JobEntity job) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(job);
		session.getTransaction().commit();
		
		
	}

	public void updateJob(JobEntity updatedJob) {
		Session session =factory.getCurrentSession();
		session.beginTransaction();
		int id = updateJob.getJobId();
		JobEntity job =session.get(JobEntity.class,id)
		session.getTransaction().commit();
	}

	public void deleteJob(int jobId) {
		Session session =factory.getCurrentSession();
		session.beginTransaction();
		JobEntity job =session.get(JobEntity.class,jobId);
		session.delete(job);
		session.getTransaction().commit()
		
		
	}
	

}
