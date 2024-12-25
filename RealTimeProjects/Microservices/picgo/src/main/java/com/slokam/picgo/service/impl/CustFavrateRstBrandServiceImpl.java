package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.CustFavrateRstBrand;
import com.slokam.picgo.repo.CustFavrateRstBrandRepo;
import com.slokam.picgo.service.CustFavrateRstBrandService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustFavrateRstBrandServiceImpl implements CustFavrateRstBrandService {

      
   

	@Autowired
	private CustFavrateRstBrandRepo repo;
	
	@Override
	public List<CustFavrateRstBrand> getAll() {
		return repo.findAll();
	}

	@Override
	public CustFavrateRstBrand getById(Integer id) {
		
		Optional<CustFavrateRstBrand> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public CustFavrateRstBrand save(CustFavrateRstBrand todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(CustFavrateRstBrand todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
