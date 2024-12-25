package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.AddressType;
import com.slokam.picgo.repo.AddressTypeRepo;
import com.slokam.picgo.service.AddressTypeService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AddressTypeServiceImpl implements AddressTypeService {

      
   

	@Autowired
	private AddressTypeRepo repo;
	
	@Override
	public List<AddressType> getAll() {
		return repo.findAll();
	}

	@Override
	public AddressType getById(Integer id) {
		
		Optional<AddressType> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public AddressType save(AddressType todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(AddressType todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
