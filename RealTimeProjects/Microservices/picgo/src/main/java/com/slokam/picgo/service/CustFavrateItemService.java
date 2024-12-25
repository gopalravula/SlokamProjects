package com.slokam.picgo.service;

import com.slokam.picgo.entity.CustFavrateItem;
import com.slokam.picgo.repo.CustFavrateItemRepo;

import java.util.*;

public interface CustFavrateItemService {
	
	public List<CustFavrateItem> getAll();
	public CustFavrateItem getById(Integer id);
	public CustFavrateItem save(CustFavrateItem CustFavrateItem);
	public void remove(CustFavrateItem CustFavrateItem);
    public void remove(Integer id);
}
