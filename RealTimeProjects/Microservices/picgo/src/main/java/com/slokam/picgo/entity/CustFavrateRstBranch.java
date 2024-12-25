package com.slokam.picgo.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class CustFavrateRstBranch implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
   @ManyToOne() 
@JoinColumn(name="fkid53") 
   private RstBranch  rstBranch;
   @ManyToOne() 
@JoinColumn(name="fkid54") 
   private Cust  customer;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public RstBranch getRstBranch() {
		return rstBranch;
	}
public void setRstBranch(RstBranch rstBranch) {
		this.rstBranch = rstBranch;
	}
public Cust getCustomer() {
		return customer;
	}
public void setCustomer(Cust customer) {
		this.customer = customer;
	}
}