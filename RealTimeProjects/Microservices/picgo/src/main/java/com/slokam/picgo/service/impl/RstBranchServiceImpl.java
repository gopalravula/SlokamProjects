package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.RstBranch;
import com.slokam.picgo.repo.RstBranchRepo;
import com.slokam.picgo.service.RstBranchService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RstBranchServiceImpl implements RstBranchService {

      
   

	@Autowired
	private RstBranchRepo repo;
	
	@Override
	public List<RstBranch> getAll() {
		return repo.findAll();
	}

	@Override
	public RstBranch getById(Integer id) {
		
		Optional<RstBranch> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public RstBranch save(RstBranch todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(RstBranch todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
