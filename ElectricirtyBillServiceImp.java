package com.sathya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.model.ElectricityBill;
import com.sathya.repo.ElectricityBillRepo;

@Service
public class ElectricirtyBillServiceImp implements ElectricityBillService 
{

	@Autowired
	private ElectricityBillRepo repo;
	@Override
	public ElectricityBill saveBill(ElectricityBill electricityBill) {
		int uts=0;
		double s_charges=0.0,total=0.0;
		s_charges=120.00;
		uts=electricityBill.getCurrent_reading()-electricityBill.getPrevious_reading();
		if(uts<300)
		{
			total=uts*1.75;
		}
		else if(uts>=300 && uts<700)
		{
			total=uts*5.75;
		}
		else if(uts>=700)
		{
			total=uts*9.75;
		}
		electricityBill.setUnits(uts);
		electricityBill.setTotal_bill(total);
		electricityBill.setService_charges(s_charges);
		ElectricityBill save=repo.save(electricityBill);
		return save;
	}
	@Override
	public ElectricityBill getOneBill(int cid) {
		ElectricityBill getOne=repo.findById(cid).get();
		return getOne;
	}

	@Override
	public List<ElectricityBill> getAllBill() {
		List<ElectricityBill> getAll=repo.findAll();
		return getAll;
	}

	@Override
	public void deleteBill(int cid) {
		repo.deleteById(cid);
	}


	

	@Override
	public ElectricityBill updateBill(ElectricityBill electricityBill, int cid) {

		ElectricityBill oldRecord=repo.findById(cid).get();
		int uts=0;
		double s_charges=0.0,total=0.0;
		s_charges=299.00;
		uts=electricityBill.getCurrent_reading()-electricityBill.getPrevious_reading();
		if(uts<300)
		{
			total=uts*1.75;
		}
		else if(uts>=300 && uts<700)
		{
			total=uts*3.75;
		}
		else if(uts>=700)
		{
			total=uts*8.75;
		}
		oldRecord.setCid(cid);
		oldRecord.setName(electricityBill.getName());
		oldRecord.setCurrent_reading(electricityBill.getCurrent_reading());
		oldRecord.setPrevious_reading(electricityBill.getPrevious_reading());
		oldRecord.setUnits(uts);
		oldRecord.setService_charges(s_charges);
		oldRecord.setTotal_bill(total);
		return repo.save(oldRecord);	
	}
}
