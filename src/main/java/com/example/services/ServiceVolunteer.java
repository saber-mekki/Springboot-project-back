package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.volunteer;

public interface ServiceVolunteer {
	public List<volunteer> getall();
	public void register(volunteer u);
	public void delete(int id);
	 void  update(Optional<volunteer> v,volunteer volunteer);

}
