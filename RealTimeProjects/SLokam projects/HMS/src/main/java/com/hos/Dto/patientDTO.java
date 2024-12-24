package com.hos.Dto;

import java.sql.Date;
import java.util.List;


import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@AllArgsConstructor 
@NoArgsConstructor
@Getter
@Setter
@ToString
public class patientDTO {

	
	
	
	private int pid;
	@NotEmpty
	private String pname;
	@Range(min = 5, max = 90)
	private int page;
	private String pcond;
	@Range(min = 93, max = 106)
	private double ptemp;
	private double pbp;
	@Past
	private Date   pdob;
	
	
	private adharDTO adh;
	
	
	private List<refdetailsDTO>  refdata;
	
	
	
}
