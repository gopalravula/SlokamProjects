package com.slokam.picgo.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class BranchDishAvail implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
   @ManyToOne() 
@JoinColumn(name="fkid43") 
   private Dish  dish;
   @ManyToOne() 
@JoinColumn(name="fkid44") 
   private DishStatus  status;
   @ManyToOne() 
@JoinColumn(name="fkid45") 
   private RstBranch  branch;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public Dish getDish() {
		return dish;
	}
public void setDish(Dish dish) {
		this.dish = dish;
	}
public DishStatus getStatus() {
		return status;
	}
public void setStatus(DishStatus status) {
		this.status = status;
	}
public RstBranch getBranch() {
		return branch;
	}
public void setBranch(RstBranch branch) {
		this.branch = branch;
	}
}