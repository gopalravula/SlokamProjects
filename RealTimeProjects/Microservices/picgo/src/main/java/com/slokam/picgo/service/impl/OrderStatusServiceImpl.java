package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.OrderStatus;
import com.slokam.picgo.repo.OrderStatusRepo;
import com.slokam.picgo.service.OrderStatusService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderStatusServiceImpl implements OrderStatusService {

      
   

	@Autowired
	private OrderStatusRepo repo;
	
	@Override
	public List<OrderStatus> getAll() {
		return repo.findAll();
	}

	@Override
	public OrderStatus getById(Integer id) {
		
		Optional<OrderStatus> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public OrderStatus save(OrderStatus todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(OrderStatus todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
