package com.cg.pos.service.impl;

import java.util.ArrayList;

import com.cg.pos.entity.PizzaDetailsDTO;
import com.cg.pos.exceptions.validateDetailsException;
import com.cg.pos.pizza.dao.PizzaDetailsDao;
import com.cg.pos.pizza.dao.PizzaDetailsDaoImpl;
import com.cg.pos.service.PizzaService;
import com.cg.pos.staticdb.PizzaDetailsStaticDb;
import com.cg.pos.utility.ValidatePizzaDetails;

public class PizzaServiceImpl implements PizzaService {

	ArrayList<PizzaDetailsDTO> list = PizzaDetailsStaticDb.getPizzaDetailList();

	ValidatePizzaDetails validatePizzaDetails = new ValidatePizzaDetails();
	PizzaDetailsDTO pizzaDetails;

	/**
	 * modifying name
	 * @throws validateDetailsException 
	 */
	@Override
	public String modifyName(int storeId, int pizzaId, String name) throws validateDetailsException {
		String result = "";

		if (validatePizzaDetails.isValidName(name)) {
			PizzaDetailsDao pizzaDao = new PizzaDetailsDaoImpl();
			result = pizzaDao.modifyName(storeId,pizzaId, name);
		}

		return result;

	}

	/**
	 * modifying Quantity
	 */

	@Override
	public String modifyQuantity(int storeId, int pizzaId, int quantity) throws  validateDetailsException{
		String result = "";

		if (validatePizzaDetails.isValidQuantity(quantity)&& validatePizzaDetails.isValidId(pizzaId)&&validatePizzaDetails.isValidStoreId(storeId)) {
			PizzaDetailsDao pizzaDao = new PizzaDetailsDaoImpl();
			result = pizzaDao.modifyQuantity(storeId,pizzaId, quantity);
		}

		return result;

	}

	/**
	 * modifying cost
	 */
	@Override
	public String modifyCost(int storeId, int pizzaId, double cost) throws  validateDetailsException{
		String result = "";

		if (validatePizzaDetails.isValidCost(cost)&& validatePizzaDetails.isValidId(pizzaId)&&validatePizzaDetails.isValidStoreId(storeId)) {
			PizzaDetailsDao pizzaDao = new PizzaDetailsDaoImpl();
			result = pizzaDao.modifyCost(storeId,pizzaId, cost);
		}

		

		return result;

	}

	/**
	 * modifying addOns
	 * @throws InvalidAddOnsException 
	 */
	@Override
	public String modifyAddOns(int storeId, int pizzaId, String addOns) throws  validateDetailsException {

		String result = "";

		if (validatePizzaDetails.isValidAddOn(addOns)&& validatePizzaDetails.isValidId(pizzaId)&&validatePizzaDetails.isValidStoreId(storeId)) {
			PizzaDetailsDao pizzaDao = new PizzaDetailsDaoImpl();
			result = pizzaDao.modifyAddOn(storeId,pizzaId, addOns);
		}

		

		return result;

	}

	/**
	 * deleting pizzaDetails
	 */
	@Override
	public String deletePizzaDetails(int storeId, int id)  {
		PizzaDetailsDao pizzaDao = new PizzaDetailsDaoImpl();
		boolean result = pizzaDao.deletePizzaDetails(storeId,id);
		if (result == true) {
			return "deleted";
		}
		return " nt delete";
	}
}
