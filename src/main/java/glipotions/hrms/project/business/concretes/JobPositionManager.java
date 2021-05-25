package glipotions.hrms.project.business.concretes;

import java.util.List;

import glipotions.hrms.project.business.abstracts.JobPositionService;
import glipotions.hrms.project.dataAccess.abstracts.JobPositionDao;
import glipotions.hrms.project.entities.concretes.JobPosition;

public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	
	
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao = jobPositionDao;
	}



	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

}
