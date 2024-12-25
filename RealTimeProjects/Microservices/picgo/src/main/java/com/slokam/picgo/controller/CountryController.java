package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.Country;
import com.slokam.picgo.service.CountryService;

@RestController
@RequestMapping("Country") 
public class CountryController {
	 @Autowired
	 private CountryService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Country>	 saveCountry(@RequestBody Country obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Country>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Country>	 deleteCountry(@RequestBody Country obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Country>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Country>> getAllCountry(){
		 List<Country> list = service.getAll();
		 return new ResponseEntity<List<Country>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Country> getByIdCountry(@PathVariable Integer id) {
		  Country obj =  service.getById(id);
		  return new ResponseEntity<Country>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Country>	 
	 deleteCountry(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Country>(HttpStatus.OK);
	 }
}

