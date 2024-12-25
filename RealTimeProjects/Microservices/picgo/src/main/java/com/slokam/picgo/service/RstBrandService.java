package com.slokam.picgo.service;

import com.slokam.picgo.entity.RstBrand;
import com.slokam.picgo.repo.RstBrandRepo;

import java.util.*;

public interface RstBrandService {
	
	public List<RstBrand> getAll();
	public RstBrand getById(Integer id);
	public RstBrand save(RstBrand RstBrand);
	public void remove(RstBrand RstBrand);
    public void remove(Integer id);
}
