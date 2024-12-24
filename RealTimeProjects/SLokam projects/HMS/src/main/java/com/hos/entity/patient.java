package com.hos.entity;

import java.sql.Date;
import java.util.List;


import org.hibernate.validator.constraints.Range;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
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
public class patient {

	
	
	@Id
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
	
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name = "fkaid")
	private adhar adh;
	
	@OneToMany(cascade =  CascadeType.ALL)
	@JoinColumn(name = "fkpid")
	private List<refdetails>  refdata;
	
	
	
}
