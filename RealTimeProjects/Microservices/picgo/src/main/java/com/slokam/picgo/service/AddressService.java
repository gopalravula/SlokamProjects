package com.slokam.picgo.service;

import com.slokam.picgo.entity.Address;
import com.slokam.picgo.repo.AddressRepo;

import java.util.*;

public interface AddressService {
	
	public List<Address> getAll();
	public Address getById(Integer id);
	public Address save(Address Address);
	public void remove(Address Address);
    public void remove(Integer id);
}
