package com.sathya.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ElectricityBill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name;
	private int current_reading;
	private int previous_reading;
	private int units;
	private double service_charges;
	private double total_bill;
	//PDC+PPC+PSM+PGM+toString()
	public ElectricityBill() {
		super();
	}
	public ElectricityBill(int cid, String name, int current_reading, int previous_reading, int units,
			double service_charges, double total_bill) {
		super();
		this.cid = cid;
		this.name = name;
		this.current_reading = current_reading;
		this.previous_reading = previous_reading;
		this.units = units;
		this.service_charges = service_charges;
		this.total_bill = total_bill;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrent_reading() {
		return current_reading;
	}
	public void setCurrent_reading(int current_reading) {
		this.current_reading = current_reading;
	}
	public int getPrevious_reading() {
		return previous_reading;
	}
	public void setPrevious_reading(int previous_reading) {
		this.previous_reading = previous_reading;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getService_charges() {
		return service_charges;
	}
	public void setService_charges(double service_charges) {
		this.service_charges = service_charges;
	}
	public double getTotal_bill() {
		return total_bill;
	}
	public void setTotal_bill(double total_bill) {
		this.total_bill = total_bill;
	}
	@Override
	public String toString() {
		return "ElectricityBill [cid=" + cid + ", name=" + name + ", current_reading=" + current_reading
				+ ", previous_reading=" + previous_reading + ", units=" + units + ", service_charges=" + service_charges
				+ ", total_bill=" + total_bill + "]";
	}
	
	
}
