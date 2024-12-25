package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.CustFavrateItem;
import com.slokam.picgo.repo.CustFavrateItemRepo;
import com.slokam.picgo.service.CustFavrateItemService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustFavrateItemServiceImpl implements CustFavrateItemService {

      
   

	@Autowired
	private CustFavrateItemRepo repo;
	
	@Override
	public List<CustFavrateItem> getAll() {
		return repo.findAll();
	}

	@Override
	public CustFavrateItem getById(Integer id) {
		
		Optional<CustFavrateItem> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public CustFavrateItem save(CustFavrateItem todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(CustFavrateItem todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
