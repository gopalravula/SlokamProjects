package com.slokam.picgo.service;

import com.slokam.picgo.entity.City;
import com.slokam.picgo.repo.CityRepo;

import java.util.*;

public interface CityService {
	
	public List<City> getAll();
	public City getById(Integer id);
	public City save(City City);
	public void remove(City City);
    public void remove(Integer id);
}
