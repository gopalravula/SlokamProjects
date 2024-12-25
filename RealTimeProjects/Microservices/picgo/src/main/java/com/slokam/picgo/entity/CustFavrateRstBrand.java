package com.slokam.picgo.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class CustFavrateRstBrand implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
   @ManyToOne() 
@JoinColumn(name="fkid51") 
   private RstBrand  rstBrand;
   @ManyToOne() 
@JoinColumn(name="fkid52") 
   private Cust  customer;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public RstBrand getRstBrand() {
		return rstBrand;
	}
public void setRstBrand(RstBrand rstBrand) {
		this.rstBrand = rstBrand;
	}
public Cust getCustomer() {
		return customer;
	}
public void setCustomer(Cust customer) {
		this.customer = customer;
	}
}