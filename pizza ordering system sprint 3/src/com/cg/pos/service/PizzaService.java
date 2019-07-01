package com.cg.pos.service;

import com.cg.pos.exceptions.validateDetailsException;

public interface PizzaService {
	

	String modifyName(int storeId, int pizzaId, String name) throws  validateDetailsException;

	String modifyQuantity(int storeId, int pizzaId, int quantity) throws  validateDetailsException;
			

	String modifyCost(int storeId, int pizzaId, double cost)throws  validateDetailsException;;

	String modifyAddOns(int storeId, int pizzaId, String addOns) throws  validateDetailsException;

	String deletePizzaDetails(int storeId, int id) throws  validateDetailsException;

	
}
