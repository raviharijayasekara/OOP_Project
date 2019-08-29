package com.fuel.services.FuleService;

import java.io.IOException; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import com.fuel.Util.Fule.CommonConstant;
import com.fuel.Util.Fule.FuelDBConnection;
import com.fuel.model.Fule.Fuel;

public class FuelServiceImpl implements IFuelService {

	public static Connection connection;

	public static Statement statment;

	public static PreparedStatement prepared;

	@Override
	public boolean addFuelDetails(Fuel fuel) {

		try {
			connection = FuelDBConnection.getDBConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement(CommonConstant.insertFuleDetails);
			preparedStatement.setString(1, fuel.getFuel_name());
			preparedStatement.setDouble(2, fuel.getFuel_price());
			preparedStatement.setString(3, fuel.getFuel_description());
			// execute insert SQL stetement
			preparedStatement .executeUpdate();
			
			return true;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}

	@Override
	public Fuel getFuelDetailsByID(String fuel_id) {
		try {
			connection = FuelDBConnection.getDBConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(CommonConstant.getFuleDetailsByID);
			preparedStatement.setString(1,fuel_id);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			Fuel fule = new Fuel();
			if(rs.next()) {
				fule.setFuel_id(rs.getString("fuel_id"));
				fule.setFuel_name(rs.getString("fuel_name"));
				fule.setFuel_price(rs.getDouble("fuel_price"));
				fule.setFuel_description(rs.getString("fuel_description"));
			}
			return fule;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ArrayList<Fuel> getFuelDetails() {
		try {

			ArrayList<Fuel> fuledetails = new ArrayList<Fuel>();

			connection = FuelDBConnection.getDBConnection();

			statment = connection.createStatement();

			ResultSet rs = statment.executeQuery(CommonConstant.getFuleDetails);

			while (rs.next()) {

				Fuel fule = new Fuel();

				fule.setFuel_id(rs.getString("fuel_id"));
				fule.setFuel_name(rs.getString("fuel_name"));
				fule.setFuel_price(rs.getDouble("fuel_price"));
				fule.setFuel_description(rs.getString("fuel_description"));

				fuledetails.add(fule);
			}

			return fuledetails;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateFuelDetails(Fuel fuel) {
		try {
			connection = FuelDBConnection.getDBConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement(CommonConstant.updateFuelDetails);
			preparedStatement.setString(1, fuel.getFuel_name());
			preparedStatement.setDouble(2, fuel.getFuel_price());
			preparedStatement.setString(3, fuel.getFuel_description());
			preparedStatement.setString(4, fuel.getFuel_id());
			// execute insert SQL stetement
			preparedStatement .executeUpdate();
			
			return true;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}

	@Override
	public boolean removeFuelDetails(String fuel_id) {
		try {
			connection = FuelDBConnection.getDBConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement(CommonConstant.deleteFuelDetails);
			preparedStatement.setString(1, fuel_id);
			
			// execute insert SQL stetement
			preparedStatement .executeUpdate();
			
			return true;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;

	}

}
