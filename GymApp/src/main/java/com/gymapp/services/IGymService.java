package com.gymapp.services;

import java.util.List;

import com.gymapp.exception.GymNotFoundException;
import com.gymapp.exception.IdNotFoundException;
import com.gymapp.model.Gym;

public interface IGymService {
	
	List<Gym> getAll();
	List<Gym> getByName(String type) throws GymNotFoundException;
	List<Gym> getByType() throws GymNotFoundException;
	List<Gym> getByDuration() throws GymNotFoundException;
	List<Gym> getById() throws IdNotFoundException;

}
