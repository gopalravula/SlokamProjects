package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.Item;
import com.slokam.picgo.repo.ItemRepo;
import com.slokam.picgo.service.ItemService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ItemServiceImpl implements ItemService {

      
   

	@Autowired
	private ItemRepo repo;
	
	@Override
	public List<Item> getAll() {
		return repo.findAll();
	}

	@Override
	public Item getById(Integer id) {
		
		Optional<Item> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Item save(Item todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Item todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
