package com.slokam.picgo.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class CustFavrateItem implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
   @ManyToOne() 
@JoinColumn(name="fkid37") 
   private Item  item;
   @ManyToOne() 
@JoinColumn(name="fkid38") 
   private Cust  customer;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public Item getItem() {
		return item;
	}
public void setItem(Item item) {
		this.item = item;
	}
public Cust getCustomer() {
		return customer;
	}
public void setCustomer(Cust customer) {
		this.customer = customer;
	}
}