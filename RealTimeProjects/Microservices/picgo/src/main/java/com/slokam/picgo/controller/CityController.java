package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.City;
import com.slokam.picgo.service.CityService;

@RestController
@RequestMapping("City") 
public class CityController {
	 @Autowired
	 private CityService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<City>	 saveCity(@RequestBody City obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<City>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<City>	 deleteCity(@RequestBody City obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<City>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<City>> getAllCity(){
		 List<City> list = service.getAll();
		 return new ResponseEntity<List<City>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<City> getByIdCity(@PathVariable Integer id) {
		  City obj =  service.getById(id);
		  return new ResponseEntity<City>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<City>	 
	 deleteCity(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<City>(HttpStatus.OK);
	 }
}

