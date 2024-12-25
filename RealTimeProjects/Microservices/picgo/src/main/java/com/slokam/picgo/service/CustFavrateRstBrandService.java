package com.slokam.picgo.service;

import com.slokam.picgo.entity.CustFavrateRstBrand;
import com.slokam.picgo.repo.CustFavrateRstBrandRepo;

import java.util.*;

public interface CustFavrateRstBrandService {
	
	public List<CustFavrateRstBrand> getAll();
	public CustFavrateRstBrand getById(Integer id);
	public CustFavrateRstBrand save(CustFavrateRstBrand CustFavrateRstBrand);
	public void remove(CustFavrateRstBrand CustFavrateRstBrand);
    public void remove(Integer id);
}
