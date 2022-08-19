package com.gymapp.services;

import java.util.List;
import java.util.stream.Collectors;

import com.gymapp.dao.GymDAOImpl;
import com.gymapp.dao.IGymDAO;
import com.gymapp.exception.GymNotFoundException;
import com.gymapp.exception.IdNotFoundException;
import com.gymapp.model.Gym;

public class GymServiceImpl implements IGymService {

	IGymDAO gymDAO=new GymDAOImpl(); 
	@Override
	public List<Gym> getAll() {
		List<Gym> gyms=gymDAO.findAll();
		List<Gym> gymList=gyms
				.stream()
				//.sorted((Gym g1,Gym g2)->g1.getGymName().compareTo(g2.getGymName()))
				.sorted((g1,g2)->g1.getName().compareTo(g2.getName()))
				.collect(Collectors.toList());
				return gymList;
		
		//return null;
	}

	@Override
	public List<Gym> getByName(String name) throws GymNotFoundException {
		List<Gym> gyms=gymDAO.findByName(name);
		List<Gym> gymList=gyms
				.stream()
				//.sorted((Gym g1,Gym g2)->g1.getGymName().compareTo(g2.getGymName()))
				.sorted((g1,g2)->g1.getName().compareTo(g2.getName()))
				.collect(Collectors.toList());
				return gymList;
	}

	@Override
	public List<Gym> getByType() throws GymNotFoundException {
		List<Gym> gyms=gymDAO.findByType();
		List<Gym> gymList=gyms
				.stream()
				//.sorted((Gym g1,Gym g2)->g1.getGymName().compareTo(g2.getGymName()))
				.sorted((g1,g2)->g1.getType().compareTo(g2.getType()))
				.collect(Collectors.toList());
				return gymList;
	}

	@Override
	public List<Gym> getById() throws IdNotFoundException {
		List<Gym> gyms=gymDAO.findById();
		List<Gym> gymList=gyms
				.stream()
				//.sorted((Gym g1,Gym g2)->g1.getGymName().compareTo(g2.getGymName()))
				.sorted((g1,g2)->g1.getName().compareTo(g2.getName()))
				.collect(Collectors.toList());
				return gymList;
	}

	@Override
	public List<Gym> getByDuration() throws GymNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
