package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.DishStatus;
import com.slokam.picgo.repo.DishStatusRepo;
import com.slokam.picgo.service.DishStatusService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DishStatusServiceImpl implements DishStatusService {

      
   

	@Autowired
	private DishStatusRepo repo;
	
	@Override
	public List<DishStatus> getAll() {
		return repo.findAll();
	}

	@Override
	public DishStatus getById(Integer id) {
		
		Optional<DishStatus> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public DishStatus save(DishStatus todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(DishStatus todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
