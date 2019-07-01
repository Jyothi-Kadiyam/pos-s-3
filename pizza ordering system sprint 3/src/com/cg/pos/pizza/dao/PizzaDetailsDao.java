package com.cg.pos.pizza.dao;

public interface PizzaDetailsDao {

	boolean deletePizzaDetails(int storeId,int id);

	public String modifyName(int storeId,int id, String name);

	public String modifyQuantity(int storeId, int pizzaId, int quantity);

	public String modifyCost(int storeId, int pizzaId, double cost);

	public String modifyAddOn(int storeId, int pizzaId, String addOns);

}
