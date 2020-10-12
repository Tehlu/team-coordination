package com.jrp.er.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jrp.er.dao.ParticipantRepository;
import com.jrp.er.dto.ParticipantTimeline;
import com.jrp.er.entities.Participant;

@Controller
public class HomeController {
	
	@Autowired
	ParticipantRepository partRepo;
	
	@GetMapping
	public String displayHome(Model model) throws JsonProcessingException {
		
		Participant aPart = new Participant();
		model.addAttribute("participant", aPart);
	
		List<ParticipantTimeline> partDataTime = partRepo.getPartTimeline();	
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonTimelineString = objectMapper.writeValueAsString(partDataTime);
		
		model.addAttribute("partTimeList", jsonTimelineString);
		return "homenet";
	}
	
	@PostMapping("/partSave")
	public String createParticipant(Participant par, Model model) throws JsonProcessingException {
		
		partRepo.save(par);
		return "redirect:/";
	}
	
	@GetMapping("/event/timelines")
	public String displayTimelines(Model model) throws JsonProcessingException{	
		 List<ParticipantTimeline> partDataTime = partRepo.getPartTimeline();	
			ObjectMapper objectMapper = new ObjectMapper();
			String jsonTimelineString = objectMapper.writeValueAsString(partDataTime);
			model.addAttribute("partTimeList", jsonTimelineString);
		
		return "event-timelines";
	}
	
	

}
