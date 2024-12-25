package com.slokam.picgo.service;

import com.slokam.picgo.entity.Cust;
import com.slokam.picgo.repo.CustRepo;

import java.util.*;

public interface CustService {
	
	public List<Cust> getAll();
	public Cust getById(Integer id);
	public Cust save(Cust Cust);
	public void remove(Cust Cust);
    public void remove(Integer id);
}
