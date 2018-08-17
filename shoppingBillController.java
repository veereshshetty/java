package com.controller;

import java.util.List;
import java.util.ListIterator;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.models.shoppingBillItemModel;
import com.models.shoppingBillModel;
import com.repositories.shoppingBillRepository;

@RestController
//@CrossOrigin(origins = "http://localhost:4200/", allowedHeaders="*")
public class shoppingBillController {
	
	@Autowired
	shoppingBillRepository sb;

	//For Displaying all the bils
	@CrossOrigin(origins = "*")
	@GetMapping("/displayAllBills")
	
	List<shoppingBillModel> getAllBills()
	{
		return sb.findAll();	
	}
	
	
	//For inserting bills
	
	@PostMapping("/insert")
	shoppingBillModel insertItemintoBill(@RequestBody shoppingBillModel sbdata)
	{
		int TotalCost = 0;
		//Sum the total price of all items in the bill
		sbdata.set_id(ObjectId.get());
	  	List<shoppingBillItemModel> itemsList = sbdata.getItemList();
	  	ListIterator<shoppingBillItemModel> li = itemsList.listIterator();
	  	while(li.hasNext())
	  	{
	  		TotalCost = TotalCost + Integer.parseInt(li.next().getItemCost());
	  	}
	 	sbdata.setTotalPrice(TotalCost);
	 	
	 	//Save The data in the document
		sb.save(sbdata);
		return sbdata;
	}
	
	//for deleting the bills
	@DeleteMapping("/delete/{id}")
	String deleteBill(@PathVariable("id") String id)
	{
		sb.deleteById(id);
	    return "Shopping bill id with "+id+" Deleted";	
	}


	//Update the Current Bill
	@PutMapping("/updateBil/{id}")
	String updateBill(@PathVariable("id") ObjectId id,@RequestBody shoppingBillModel sbdata)
	{
		sbdata.set_id(id);
	    sb.save(sbdata);
	    return "Shopping Bill with "+id+" Updated";
	}
	}
	


