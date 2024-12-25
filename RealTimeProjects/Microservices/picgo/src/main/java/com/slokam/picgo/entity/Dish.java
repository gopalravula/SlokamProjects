package com.slokam.picgo.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class Dish implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  name;
   @ManyToOne() 
@JoinColumn(name="fkid41") 
   private Dish  parent;
   @ManyToOne() 
@JoinColumn(name="fkid42") 
   private RstBrand  RstBrand;
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
public Dish getParent() {
		return parent;
	}
public void setParent(Dish parent) {
		this.parent = parent;
	}
public RstBrand getRstBrand() {
		return RstBrand;
	}
public void setRstBrand(RstBrand RstBrand) {
		this.RstBrand = RstBrand;
	}
}