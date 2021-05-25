package glipotions.hrms.project.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import glipotions.hrms.project.business.abstracts.JobPositionService;
import glipotions.hrms.project.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionControllers {

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionControllers(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}
	
	
}
