package com.doc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class doctor {

	
	@Id
	private int did;
	@Override
	public String toString() {
		return "doctor [did=" + did + ", dname=" + dname + ", dfee=" + dfee + ", dspec=" + dspec + ", dopintment="
				+ dopintment + ", dstudy=" + dstudy + ", dexp=" + dexp + "]";
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public double getDfee() {
		return dfee;
	}
	public void setDfee(double dfee) {
		this.dfee = dfee;
	}
	public String getDspec() {
		return dspec;
	}
	public void setDspec(String dspec) {
		this.dspec = dspec;
	}
	public String getDopintment() {
		return dopintment;
	}
	public void setDopintment(String dopintment) {
		this.dopintment = dopintment;
	}
	public String getDstudy() {
		return dstudy;
	}
	public void setDstudy(String dstudy) {
		this.dstudy = dstudy;
	}
	public int getDexp() {
		return dexp;
	}
	public void setDexp(int dexp) {
		this.dexp = dexp;
	}
	private String dname;
	private double dfee;
	private String dspec;
	private String dopintment;
	private String dstudy;
	private int dexp;
	
}
