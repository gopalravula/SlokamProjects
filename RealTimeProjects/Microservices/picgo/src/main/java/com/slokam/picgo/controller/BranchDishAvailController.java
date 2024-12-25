package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.BranchDishAvail;
import com.slokam.picgo.service.BranchDishAvailService;

@RestController
@RequestMapping("BranchDishAvail") 
public class BranchDishAvailController {
	 @Autowired
	 private BranchDishAvailService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<BranchDishAvail>	 saveBranchDishAvail(@RequestBody BranchDishAvail obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<BranchDishAvail>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<BranchDishAvail>	 deleteBranchDishAvail(@RequestBody BranchDishAvail obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<BranchDishAvail>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<BranchDishAvail>> getAllBranchDishAvail(){
		 List<BranchDishAvail> list = service.getAll();
		 return new ResponseEntity<List<BranchDishAvail>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<BranchDishAvail> getByIdBranchDishAvail(@PathVariable Integer id) {
		  BranchDishAvail obj =  service.getById(id);
		  return new ResponseEntity<BranchDishAvail>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<BranchDishAvail>	 
	 deleteBranchDishAvail(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<BranchDishAvail>(HttpStatus.OK);
	 }
}

