package com.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.models.shoppingBillModel;

public interface shoppingBillRepository extends MongoRepository<shoppingBillModel, String> {
	
	public shoppingBillModel findBy_id(ObjectId _id);

}
