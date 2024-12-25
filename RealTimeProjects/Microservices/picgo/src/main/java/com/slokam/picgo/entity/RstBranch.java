package com.slokam.picgo.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class RstBranch implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  name;
   @ManyToOne() 
@JoinColumn(name="fkid39") 
   private RstBrand  restbrand;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getName() {
		return name;
	}
public void setName(String name) {
		this.name = name;
	}
public RstBrand getRestbrand() {
		return restbrand;
	}
public void setRestbrand(RstBrand restbrand) {
		this.restbrand = restbrand;
	}
}