package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entities.volunteer;
import com.example.repositories.VolunteerReprository;
import com.example.utils.MailService;

@Service(value = "VolenteerService")
public class ServiceVolunteerImpl implements ServiceVolunteer{
	@Autowired
	private VolunteerReprository  volunteerReprository;

	@Autowired
	private MailService mailService;

	
	
	
	public List<volunteer> getall(){
		List<volunteer> list=new ArrayList<>();
		volunteerReprository.findAll().iterator().forEachRemaining(list::add);
		return list;
	};
	

	@Override
	public void register(volunteer Volunteer) {
		mailService.sendVolunteerEmail(Volunteer);
		volunteerReprository.save(Volunteer);
	}

}
