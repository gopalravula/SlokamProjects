package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.Cart;
import com.slokam.picgo.repo.CartRepo;
import com.slokam.picgo.service.CartService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CartServiceImpl implements CartService {

      
   

	@Autowired
	private CartRepo repo;
	
	@Override
	public List<Cart> getAll() {
		return repo.findAll();
	}

	@Override
	public Cart getById(Integer id) {
		
		Optional<Cart> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Cart save(Cart todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Cart todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
