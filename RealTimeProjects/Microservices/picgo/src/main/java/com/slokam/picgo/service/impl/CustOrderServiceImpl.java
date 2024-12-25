package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.CustOrder;
import com.slokam.picgo.repo.CustOrderRepo;
import com.slokam.picgo.service.CustOrderService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustOrderServiceImpl implements CustOrderService {

      
   

	@Autowired
	private CustOrderRepo repo;
	
	@Override
	public List<CustOrder> getAll() {
		return repo.findAll();
	}

	@Override
	public CustOrder getById(Integer id) {
		
		Optional<CustOrder> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public CustOrder save(CustOrder todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(CustOrder todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
