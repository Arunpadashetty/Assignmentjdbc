package com.gymapp.dao;

import java.util.List;

import com.gymapp.exception.GymNotFoundException;
import com.gymapp.exception.IdNotFoundException;
import com.gymapp.model.Gym;

public class GymDAOImpl implements IGymDAO{

	@Override
	public List<Gym> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gym> findByName(String type) throws GymNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gym> findByType() throws GymNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gym> findByDuration() throws GymNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gym> findById() throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
