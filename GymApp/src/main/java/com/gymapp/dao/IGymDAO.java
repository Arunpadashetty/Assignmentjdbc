package com.gymapp.dao;

import java.util.List;

import com.gymapp.exception.GymNotFoundException;
import com.gymapp.exception.IdNotFoundException;
import com.gymapp.model.Gym;

public interface IGymDAO {

	List<Gym> findAll();
	List<Gym> findByName(String type) throws GymNotFoundException;
	List<Gym> findByType() throws GymNotFoundException;
	List<Gym> findByDuration() throws GymNotFoundException;
	List<Gym> findById() throws IdNotFoundException;
}
