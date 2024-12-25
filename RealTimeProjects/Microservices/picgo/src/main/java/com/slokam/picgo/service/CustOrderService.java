package com.slokam.picgo.service;

import com.slokam.picgo.entity.CustOrder;
import com.slokam.picgo.repo.CustOrderRepo;

import java.util.*;

public interface CustOrderService {
	
	public List<CustOrder> getAll();
	public CustOrder getById(Integer id);
	public CustOrder save(CustOrder CustOrder);
	public void remove(CustOrder CustOrder);
    public void remove(Integer id);
}
