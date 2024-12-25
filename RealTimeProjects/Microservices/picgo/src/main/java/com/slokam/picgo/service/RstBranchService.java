package com.slokam.picgo.service;

import com.slokam.picgo.entity.RstBranch;
import com.slokam.picgo.repo.RstBranchRepo;

import java.util.*;

public interface RstBranchService {
	
	public List<RstBranch> getAll();
	public RstBranch getById(Integer id);
	public RstBranch save(RstBranch RstBranch);
	public void remove(RstBranch RstBranch);
    public void remove(Integer id);
}
