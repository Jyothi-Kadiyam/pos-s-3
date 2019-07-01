package com.cg.pos.utility;

import com.cg.pos.exceptions.*;

public class ValidatePizzaDetails {

	/**
	 * Validating the pizzaName.
	 * 
	 * @param quantity
	 * @return
	 * @throws InvalidItemNameException
	 * @throws validateDetailsException 
	 */
	public boolean isValidName(String name) throws validateDetailsException {
		
		if (!name.matches("[a-z A-Z]+{1,25}")) {

			throw new validateDetailsException(Exceptions.INVALIDSTORNAME);
		}
		return true;
	}

	/**
	 * Validating StoreName
	 * 
	 * @param storeName
	 * @return
	 * @throws validateDetailsException 
	 * @throws InvalidStoreNameException
	 *             //
	 */
	public boolean isValidStoreId(int storeId) throws validateDetailsException {
		String tempStoreId=Integer.toString(storeId);
		if (tempStoreId.matches("[a-z A-Z]+{1,25}")) {

			throw new validateDetailsException(Exceptions.INVALIDSTOREID);
		}
		return true;
	}

	/**
	 * Validating Quantity
	 * 
	 * @param quantity
	 * @return
	 * @throws InvalidItemQuantityException
	 * @throws validateDetailsException 
	 */
	public boolean isValidQuantity(int quantity) throws  validateDetailsException {
		String stringQuantity = Integer.toString(quantity);
		if (!stringQuantity.matches("[0-9]{1,5}") || quantity <= 0) {
			throw new validateDetailsException(Exceptions.INVALIDQUANTITY);

			
		}

		return true;
	}

	/**
	 * validating Id
	 * 
	 * @param id
	 * @return
	 * @throws InvalidItemIdException
	 * @throws validateDetailsException 
	 */
	public boolean isValidId(int id) throws  validateDetailsException {
		String stringId = Integer.toString(id);
		if (!stringId.matches("[0-9]+{1,5}")) {
			
			throw new validateDetailsException(Exceptions.INVALIDID);
			
		}

		return true;
	}

	/**
	 * Validating Cost
	 * 
	 * @param cost
	 * @return
	 * @throws InvalidItemCostException
	 * @throws validateDetailsException 
	 */

	public boolean isValidCost(double cost) throws  validateDetailsException {
		String stringCost = Double.toString(cost);
		if (stringCost.isEmpty() || cost <= 0.0 || stringCost.matches("[A-Z a-z]")) {
			throw new validateDetailsException(Exceptions.INVALIDCOST);
			
		}
		return true;

	}

	/**
	 * Validating Addons
	 * 
	 * @param addOns
	 * @return
	 * @throws InvalidAddOnsException
	 * @throws validateDetailsException 
	 */

	public boolean isValidAddOn(String addOns) throws validateDetailsException {
		if (!addOns.matches("[A-Z a-z]+{1,30}")) {
			
			throw new validateDetailsException(Exceptions.INVALIDADDON);
		}
		return true;
	}

	

}
