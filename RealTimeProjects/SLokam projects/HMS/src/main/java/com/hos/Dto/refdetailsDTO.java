package com.hos.Dto;


import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
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
public class refdetailsDTO {

	
	

	private int rid;
	private String rname;
	@NotEmpty
	private long rphone;
	private String raddress;
	
	
}
