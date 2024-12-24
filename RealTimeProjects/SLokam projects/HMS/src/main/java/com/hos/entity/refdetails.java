package com.hos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor 
@NoArgsConstructor
@Getter
@Setter
@ToString
public class refdetails {

	
	
	@Id
	private int rid;
	private String rname;
	private long rphone;
	private String raddress;
	
	
}
