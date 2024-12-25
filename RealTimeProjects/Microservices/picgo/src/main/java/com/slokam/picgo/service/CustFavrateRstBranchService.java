package com.slokam.picgo.service;

import com.slokam.picgo.entity.CustFavrateRstBranch;
import com.slokam.picgo.repo.CustFavrateRstBranchRepo;

import java.util.*;

public interface CustFavrateRstBranchService {
	
	public List<CustFavrateRstBranch> getAll();
	public CustFavrateRstBranch getById(Integer id);
	public CustFavrateRstBranch save(CustFavrateRstBranch CustFavrateRstBranch);
	public void remove(CustFavrateRstBranch CustFavrateRstBranch);
    public void remove(Integer id);
}
