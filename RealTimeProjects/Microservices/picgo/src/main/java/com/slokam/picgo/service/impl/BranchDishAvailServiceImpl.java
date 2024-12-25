package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.BranchDishAvail;
import com.slokam.picgo.repo.BranchDishAvailRepo;
import com.slokam.picgo.service.BranchDishAvailService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BranchDishAvailServiceImpl implements BranchDishAvailService {

      
   

	@Autowired
	private BranchDishAvailRepo repo;
	
	@Override
	public List<BranchDishAvail> getAll() {
		return repo.findAll();
	}

	@Override
	public BranchDishAvail getById(Integer id) {
		
		Optional<BranchDishAvail> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public BranchDishAvail save(BranchDishAvail todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(BranchDishAvail todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
