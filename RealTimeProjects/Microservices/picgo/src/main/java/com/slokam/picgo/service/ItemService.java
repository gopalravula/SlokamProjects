package com.slokam.picgo.service;

import com.slokam.picgo.entity.Item;
import com.slokam.picgo.repo.ItemRepo;

import java.util.*;

public interface ItemService {
	
	public List<Item> getAll();
	public Item getById(Integer id);
	public Item save(Item Item);
	public void remove(Item Item);
    public void remove(Integer id);
}
