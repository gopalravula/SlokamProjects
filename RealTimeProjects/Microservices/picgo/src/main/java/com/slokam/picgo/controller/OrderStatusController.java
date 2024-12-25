package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picgo.entity.OrderStatus;
import com.slokam.picgo.service.OrderStatusService;

@RestController
@RequestMapping("OrderStatus") 
public class OrderStatusController {
	 @Autowired
	 private OrderStatusService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<OrderStatus>	 saveOrderStatus(@RequestBody OrderStatus obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<OrderStatus>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<OrderStatus>	 deleteOrderStatus(@RequestBody OrderStatus obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<OrderStatus>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<OrderStatus>> getAllOrderStatus(){
		 List<OrderStatus> list = service.getAll();
		 return new ResponseEntity<List<OrderStatus>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<OrderStatus> getByIdOrderStatus(@PathVariable Integer id) {
		  OrderStatus obj =  service.getById(id);
		  return new ResponseEntity<OrderStatus>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<OrderStatus>	 
	 deleteOrderStatus(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<OrderStatus>(HttpStatus.OK);
	 }
}

