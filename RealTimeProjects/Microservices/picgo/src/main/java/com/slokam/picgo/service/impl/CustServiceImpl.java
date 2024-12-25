package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.Cust;
import com.slokam.picgo.repo.CustRepo;
import com.slokam.picgo.service.CustService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustServiceImpl implements CustService {

      
   

	@Autowired
	private CustRepo repo;
	
	@Override
	public List<Cust> getAll() {
		return repo.findAll();
	}

	@Override
	public Cust getById(Integer id) {
		
		Optional<Cust> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Cust save(Cust todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Cust todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
