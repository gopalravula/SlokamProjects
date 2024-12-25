package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.RstBrand;
import com.slokam.picgo.repo.RstBrandRepo;
import com.slokam.picgo.service.RstBrandService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RstBrandServiceImpl implements RstBrandService {

      
   

	@Autowired
	private RstBrandRepo repo;
	
	@Override
	public List<RstBrand> getAll() {
		return repo.findAll();
	}

	@Override
	public RstBrand getById(Integer id) {
		
		Optional<RstBrand> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public RstBrand save(RstBrand todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(RstBrand todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
