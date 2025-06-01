package com.sathya.service;

import java.util.List;

import com.sathya.model.ElectricityBill;

public interface ElectricityBillService {

	public ElectricityBill saveBill(ElectricityBill electricityBill);
	public ElectricityBill updateBill(ElectricityBill electricityBill, int cid);
	public ElectricityBill getOneBill(int cid );
	public void deleteBill(int cid);
	public List<ElectricityBill> getAllBill();
}
