package glipotions.hrms.project.business.abstracts;

import java.util.List;

import glipotions.hrms.project.entities.concretes.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
}
