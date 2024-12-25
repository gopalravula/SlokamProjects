package com.slokam.picgo.service;

import com.slokam.picgo.entity.AddressType;
import com.slokam.picgo.repo.AddressTypeRepo;

import java.util.*;

public interface AddressTypeService {
	
	public List<AddressType> getAll();
	public AddressType getById(Integer id);
	public AddressType save(AddressType AddressType);
	public void remove(AddressType AddressType);
    public void remove(Integer id);
}
