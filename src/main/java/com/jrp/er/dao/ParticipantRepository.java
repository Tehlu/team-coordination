package com.jrp.er.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jrp.er.dto.ParticipantTimeline;
import com.jrp.er.entities.Participant;


//@Repository
public interface ParticipantRepository extends CrudRepository<Participant, Long> {

	@Query(nativeQuery=true, value="Select name, start_date as startDate, end_date as endDate" + 
			" from Participant where start_date is not null ")
	public List<ParticipantTimeline> getPartTimeline();
	
	@Override
	public List<Participant> findAll();
}
