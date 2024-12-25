package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.Dish;
import com.slokam.picgo.service.DishService;

@RestController
@RequestMapping("Dish") 
public class DishController {
	 @Autowired
	 private DishService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Dish>	 saveDish(@RequestBody Dish obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Dish>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Dish>	 deleteDish(@RequestBody Dish obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Dish>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Dish>> getAllDish(){
		 List<Dish> list = service.getAll();
		 return new ResponseEntity<List<Dish>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Dish> getByIdDish(@PathVariable Integer id) {
		  Dish obj =  service.getById(id);
		  return new ResponseEntity<Dish>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Dish>	 
	 deleteDish(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Dish>(HttpStatus.OK);
	 }
}

