package com.cg.pos.utility;

public class Queries {

	public static final String RETRIVE_STORE_NAME_QUERY = "select storeId,itemId from pizza where itemId=? and storeId=?";
	public static final String retriveCount = "select * from pizza";
	public static final String deleteRow = "delete from pizza where itemId=? and storeId=?";
	public static final String modifyName = "update pizza set pizzaName=? where itemId=? and storeId=?";

}
