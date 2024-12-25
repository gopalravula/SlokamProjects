package com.slokam.picgo.service;

import com.slokam.picgo.entity.DishStatus;
import com.slokam.picgo.repo.DishStatusRepo;

import java.util.*;

public interface DishStatusService {
	
	public List<DishStatus> getAll();
	public DishStatus getById(Integer id);
	public DishStatus save(DishStatus DishStatus);
	public void remove(DishStatus DishStatus);
    public void remove(Integer id);
}
