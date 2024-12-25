package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.Dish;
import com.slokam.picgo.repo.DishRepo;
import com.slokam.picgo.service.DishService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DishServiceImpl implements DishService {

      
   

	@Autowired
	private DishRepo repo;
	
	@Override
	public List<Dish> getAll() {
		return repo.findAll();
	}

	@Override
	public Dish getById(Integer id) {
		
		Optional<Dish> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Dish save(Dish todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Dish todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
