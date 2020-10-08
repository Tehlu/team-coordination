package com.jrp.er.entities;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Participant {
   
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	 //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="participant_seq")
	private long participantID;
	private String name;
	
	//@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date startDate;
	
	//@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date endDate;
	
	public Participant(String name, Date startDate, Date endDate) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
    
	public Participant() {
		
	}

	
	
	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public long getParticipantID() {
		return participantID;
	}

	public void setParticipantID(long participantID) {
		this.participantID = participantID;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	
}
