package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.AddressType;
import com.slokam.picgo.service.AddressTypeService;

@RestController
@RequestMapping("AddressType") 
public class AddressTypeController {
	 @Autowired
	 private AddressTypeService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<AddressType>	 saveAddressType(@RequestBody AddressType obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<AddressType>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<AddressType>	 deleteAddressType(@RequestBody AddressType obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<AddressType>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<AddressType>> getAllAddressType(){
		 List<AddressType> list = service.getAll();
		 return new ResponseEntity<List<AddressType>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<AddressType> getByIdAddressType(@PathVariable Integer id) {
		  AddressType obj =  service.getById(id);
		  return new ResponseEntity<AddressType>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<AddressType>	 
	 deleteAddressType(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<AddressType>(HttpStatus.OK);
	 }
}

