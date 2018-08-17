package com.models;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class shoppingBillModel {
	
	@Id
	  public ObjectId _id;
	 
	 String billName;
	 int 	totalPrice;
	 List<shoppingBillItemModel> itemList;
	 public String get_id() {
			return _id.toHexString();
		}
		public void set_id(ObjectId _id) {
			this._id = _id;
		}
		public String getBillName() {
			return billName;
		}
		public void setBillName(String billName) {
			this.billName = billName;
		}
		public int getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
		}
		public List<shoppingBillItemModel> getItemList() {
			return itemList;
		}
		public void setItemList(List<shoppingBillItemModel> itemList) {
			this.itemList = itemList;
		}

}
