package com.cg.pos.pizza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.pos.entity.PizzaDetailsDTO;
import com.cg.pos.utility.ConnectionFactory;
import com.cg.pos.utility.Queries;

public class PizzaDetailsDaoImpl implements PizzaDetailsDao {

	PizzaDetailsDTO detailsDTO =null;

	@Override
	public boolean deletePizzaDetails(int storeId,int id) {
		boolean result =false;
		try {
			Connection connection = ConnectionFactory.getConnection();
			String sql = Queries.deleteRow;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setInt(2, storeId);
			System.out.println("dg");
			int i=preparedStatement.executeUpdate();
			System.out.println(i);		
			if (i==1) {
				result = true;
			}
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println("e........");
		}
		return result;
	}

	

	public String modifyName( int storeId,int id,String name) {
		String result = "";
		try {
			Connection connection = ConnectionFactory.getConnection();
			String sql = Queries.modifyName;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, id);
			preparedStatement.setInt(3, storeId);
			int i= preparedStatement.executeUpdate();
			if (i == 1)
				result = "name modified";
			else
				System.out.println("sdg");
		} catch (SQLException e) {
         System.out.println("exc");
		}
		return result;
	}

	@Override
	public String modifyQuantity(int storeId, int pizzaId, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modifyCost(int storeId, int pizzaId, double cost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modifyAddOn(int storeId, int pizzaId, String addOns) {
		// TODO Auto-generated method stub
		return null;
	}



	

}
