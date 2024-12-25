package com.slokam.picgo.service;

import com.slokam.picgo.entity.BranchDishAvail;
import com.slokam.picgo.repo.BranchDishAvailRepo;

import java.util.*;

public interface BranchDishAvailService {
	
	public List<BranchDishAvail> getAll();
	public BranchDishAvail getById(Integer id);
	public BranchDishAvail save(BranchDishAvail BranchDishAvail);
	public void remove(BranchDishAvail BranchDishAvail);
    public void remove(Integer id);
}
