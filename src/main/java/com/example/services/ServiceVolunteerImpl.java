package com.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entities.volunteer;
import com.example.repositories.VolunteerReprository;

@Service(value = "VolenteerService")
public class ServiceVolunteerImpl implements ServiceVolunteer{
	@Autowired
	 private VolunteerReprository  volunteerReprository;

	
	
//mazilt mouch mthabit fihaa
	@Override
	public void update(Optional<volunteer> v,volunteer volunteer) {
		volunteer.seVolunteer(v.get());
		volunteerReprository.saveAndFlush(volunteer);
		
		
	}

	@Override
	public void delete(int id) {
		volunteerReprository.deleteById(id);
	}
	
	@Override
	public List<volunteer> getall(){
		List<volunteer> list=new ArrayList<>();
		volunteerReprository.findAll().iterator().forEachRemaining(list::add);
		return list;
	};
	

	@Override
	public void register(volunteer Volunteer) {
		volunteerReprository.save(Volunteer);
	}

}
