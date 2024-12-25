package com.slokam.picgo.service;

import com.slokam.picgo.entity.Cart;
import com.slokam.picgo.repo.CartRepo;

import java.util.*;

public interface CartService {
	
	public List<Cart> getAll();
	public Cart getById(Integer id);
	public Cart save(Cart Cart);
	public void remove(Cart Cart);
    public void remove(Integer id);
}
