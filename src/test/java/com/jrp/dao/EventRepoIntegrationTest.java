package com.jrp.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;

import com.jrp.er.EventRegistrationApplication;
import com.jrp.er.dao.ParticipantRepository;
import com.jrp.er.entities.Participant;

@ContextConfiguration(classes=EventRegistrationApplication.class)
@RunWith(SpringRunner.class)
@DataJpaTest
@SqlGroup({@Sql(executionPhase=ExecutionPhase.BEFORE_TEST_METHOD,scripts= {"classpath:schema.sql","classpath:data.sql"}),
	@Sql(executionPhase=ExecutionPhase.AFTER_TEST_METHOD,scripts= "classpath:drop.sql")})
public class EventRepoIntegrationTest {
	
	@Autowired
	ParticipantRepository parRepo;
	
	@Test
	public void ifNewParticipantSaved_thenSuccess() {
		Participant newParticipant = new Participant("Test_Name", new Date(20200814), new Date(20200825));
		parRepo.save(newParticipant);
		assertEquals(6,parRepo.findAll().size());		
	}
	
}
