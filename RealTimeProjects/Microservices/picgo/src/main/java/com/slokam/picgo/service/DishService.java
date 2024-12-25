package com.slokam.picgo.service;

import com.slokam.picgo.entity.Dish;
import com.slokam.picgo.repo.DishRepo;

import java.util.*;

public interface DishService {
	
	public List<Dish> getAll();
	public Dish getById(Integer id);
	public Dish save(Dish Dish);
	public void remove(Dish Dish);
    public void remove(Integer id);
}
