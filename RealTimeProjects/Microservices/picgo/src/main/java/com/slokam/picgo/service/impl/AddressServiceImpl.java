package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.Address;
import com.slokam.picgo.repo.AddressRepo;
import com.slokam.picgo.service.AddressService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service

public class AddressServiceImpl implements AddressService {

      
   

	@Autowired
	private AddressRepo repo;
	
	@Override
	public List<Address> getAll() {
		return repo.findAll();
	}

	@Override
	public Address getById(Integer id) {
		
		Optional<Address> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Address save(Address todo) {
		return repo.save(todo);
	}

	@Override

	public void remove(Address todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
