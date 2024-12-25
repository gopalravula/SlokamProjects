package com.slokam.picgo.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class Address implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  flatno;
  private String  apartmentName;
  private String  houseNo;
  private String  landMark;
  private Long  pincode;
  private String  latitude;
  private String  longitude;
  private AddressType  addType;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getFlatno() {
		return flatno;
	}
public void setFlatno(String flatno) {
		this.flatno = flatno;
	}
public String getApartmentName() {
		return apartmentName;
	}
public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
public String getHouseNo() {
		return houseNo;
	}
public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
public String getLandMark() {
		return landMark;
	}
public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
public Long getPincode() {
		return pincode;
	}
public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
public String getLatitude() {
		return latitude;
	}
public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
public String getLongitude() {
		return longitude;
	}
public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
public AddressType getAddType() {
		return addType;
	}
public void setAddType(AddressType addType) {
		this.addType = addType;
	}
}