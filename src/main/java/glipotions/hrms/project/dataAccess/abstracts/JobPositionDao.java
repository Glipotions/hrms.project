package glipotions.hrms.project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import glipotions.hrms.project.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{
	
}

