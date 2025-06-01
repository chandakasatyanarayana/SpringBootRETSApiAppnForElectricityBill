package com.sathya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.model.ElectricityBill;
import com.sathya.service.ElectricirtyBillServiceImp;

@RestController
@CrossOrigin(origins = { "*" })
public class ElectricityBillController {

	@Autowired
	private ElectricirtyBillServiceImp service;
	
	@PostMapping("/save")
	public String saveBillData(@RequestBody ElectricityBill electricityBill)
	{
		ElectricityBill saveData=service.saveBill(electricityBill);
		String message=null;
		if(saveData!=null)
		{
			message="Data Saved SuccessFully";
		}
		else
		{
			message="Data is Failed";
		}
		return message;
	}
	@GetMapping("/getOne/{cid}")
	public ElectricityBill getOneConsumerRecord(@PathVariable int cid)
	{
		ElectricityBill get=service.getOneBill(cid);
		return get;
	}
	@GetMapping("/getAll")
	public List<ElectricityBill> getAllConsumers()
	{
		List<ElectricityBill> getAllConsumers=service.getAllBill();
		return getAllConsumers;
	}
	@DeleteMapping("/delete/{cid}")
	public void delete(@PathVariable int cid)
	{
		service.deleteBill(cid);
	}
	
	@PutMapping("/update/{cid}")
	public ElectricityBill updateConsumer(@RequestBody 
			ElectricityBill electricityBill,@PathVariable int cid)
	{
		
		
		ElectricityBill update=service.updateBill(electricityBill, cid);
		return update;
	}
	
}
