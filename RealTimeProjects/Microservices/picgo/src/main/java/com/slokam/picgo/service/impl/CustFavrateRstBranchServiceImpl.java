package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.CustFavrateRstBranch;
import com.slokam.picgo.repo.CustFavrateRstBranchRepo;
import com.slokam.picgo.service.CustFavrateRstBranchService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustFavrateRstBranchServiceImpl implements CustFavrateRstBranchService {

      
   

	@Autowired
	private CustFavrateRstBranchRepo repo;
	
	@Override
	public List<CustFavrateRstBranch> getAll() {
		return repo.findAll();
	}

	@Override
	public CustFavrateRstBranch getById(Integer id) {
		
		Optional<CustFavrateRstBranch> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public CustFavrateRstBranch save(CustFavrateRstBranch todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(CustFavrateRstBranch todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
