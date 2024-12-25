package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.Address;
import com.slokam.picgo.service.AddressService;

@RestController
@RequestMapping("Address") 
public class AddressController {
	 @Autowired
	 private AddressService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Address>	 saveAddress(@RequestBody Address obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Address>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Address>	 deleteAddress(@RequestBody Address obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Address>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Address>> getAllAddress(){
		 List<Address> list = service.getAll();
		 return new ResponseEntity<List<Address>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Address> getByIdAddress(@PathVariable Integer id) {
		  Address obj =  service.getById(id);
		  return new ResponseEntity<Address>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Address>	 
	 deleteAddress(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Address>(HttpStatus.OK);
	 }
}

