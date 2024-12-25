package com.slokam.picgo.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class CustOrder implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
   @ManyToOne() 
@JoinColumn(name="fkid48") 
   private Cust  cust;
@OneToOne 
@JoinColumn(name="fkid49") 
  private Item  item;
  private Integer  quantity;
  private Date  time;
   @ManyToOne() 
@JoinColumn(name="fkid50") 
   private OrderStatus  status;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public Cust getCust() {
		return cust;
	}
public void setCust(Cust cust) {
		this.cust = cust;
	}
public Item getItem() {
		return item;
	}
public void setItem(Item item) {
		this.item = item;
	}
public Integer getQuantity() {
		return quantity;
	}
public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
public Date getTime() {
		return time;
	}
public void setTime(Date time) {
		this.time = time;
	}
public OrderStatus getStatus() {
		return status;
	}
public void setStatus(OrderStatus status) {
		this.status = status;
	}
}