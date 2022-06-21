package org.idealsolution.restapp.joblisting;



import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.idealsolution.restapp.hibernate.Entities.ApplicantEntity;
import org.idealsolution.restapp.hibernate.Entities.JobEntity;
import org.idealsolution.restapp.services.jobService;

@Path("/joblisting/jobs")
public class Jobs {
	
	jobService service = new jobService();
	
	
	@GET
	@Produces(MediaType.Application_JSON)
	public List<JobEntity> getJobs() {
		List <JobEntity> list =  service.getJobs();
		return list;
	}
	@POST
	
   @Consumes(MediaType.Application_JSON)
	public void postJobs(JobEntity Job) {
		service.addJob(Job);
		
}
	@PUT
	@Path("/{jobId}")
    @Consumes(MediaType.Application_JSON)
	public void putJobs(@PathParam("jobId") int jobId , JobEntity updatedJob) {
      updatedJob.setJobId(jobId);
		service.updateJob(updatedJob);
		}
	
	@DELETE
	@Path("/{jobId}")
    @Consumes(MediaType.Application_JSON)
	public void deleteJobs(@PathParam("jobId") int jobId) {
		service.deleteJob(jobId);
	
	
}
	@GET
	@Path("/{jobId}/applicants")
	@Produces(MediaType.Application_JSON)
	public List<ApplicantEntity> getApplicantsByJob(@PathParam("jobId") int jobId) {
		List <ApplicantEntity> applicantlist =  ApplicantsService.getApplicantsByJob();
		return applicantlist;
	}
