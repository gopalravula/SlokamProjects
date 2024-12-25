package com.slokam.picgo.service;

import com.slokam.picgo.entity.Country;
import com.slokam.picgo.repo.CountryRepo;

import java.util.*;

public interface CountryService {
	
	public List<Country> getAll();
	public Country getById(Integer id);
	public Country save(Country Country);
	public void remove(Country Country);
    public void remove(Integer id);
}
