package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.City;
import com.slokam.picgo.repo.CityRepo;
import com.slokam.picgo.service.CityService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CityServiceImpl implements CityService {

      
   

	@Autowired
	private CityRepo repo;
	
	@Override
	public List<City> getAll() {
		return repo.findAll();
	}

	@Override
	public City getById(Integer id) {
		
		Optional<City> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public City save(City todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(City todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
