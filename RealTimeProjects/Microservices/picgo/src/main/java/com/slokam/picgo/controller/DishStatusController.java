package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.DishStatus;
import com.slokam.picgo.service.DishStatusService;

@RestController
@RequestMapping("DishStatus") 
public class DishStatusController {
	 @Autowired
	 private DishStatusService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<DishStatus>	 saveDishStatus(@RequestBody DishStatus obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<DishStatus>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<DishStatus>	 deleteDishStatus(@RequestBody DishStatus obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<DishStatus>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<DishStatus>> getAllDishStatus(){
		 List<DishStatus> list = service.getAll();
		 return new ResponseEntity<List<DishStatus>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<DishStatus> getByIdDishStatus(@PathVariable Integer id) {
		  DishStatus obj =  service.getById(id);
		  return new ResponseEntity<DishStatus>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<DishStatus>	 
	 deleteDishStatus(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<DishStatus>(HttpStatus.OK);
	 }
}

