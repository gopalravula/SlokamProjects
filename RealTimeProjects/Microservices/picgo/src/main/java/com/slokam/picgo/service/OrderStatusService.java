package com.slokam.picgo.service;

import com.slokam.picgo.entity.OrderStatus;
import com.slokam.picgo.repo.OrderStatusRepo;

import java.util.*;

public interface OrderStatusService {
	
	public List<OrderStatus> getAll();
	public OrderStatus getById(Integer id);
	public OrderStatus save(OrderStatus OrderStatus);
	public void remove(OrderStatus OrderStatus);
    public void remove(Integer id);
}
