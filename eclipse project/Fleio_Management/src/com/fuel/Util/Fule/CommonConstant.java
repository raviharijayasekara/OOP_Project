package com.fuel.Util.Fule;

public class CommonConstant {
	
	public static String createFuleTable= "CREATE TABLE IF NOT EXISTS fuel(" + 
			"    fuel_id int NOT NULL AUTO_INCREMENT," + 
			"    fuel_name varchar(255) NOT NULL," + 
			"    fuel_price Double," + 
			"    fuel_description varchar(255) NOT NULL," + 
			"    PRIMARY KEY (fuel_id)" + 
			")";
	
	public static String getFuleDetails= "SELECT * FROM fuel";
	
	public static String insertFuleDetails = "INSERT INTO fuel(fuel_name, fuel_price, fuel_description) VALUES (?,?,?)";

	public static String getFuleDetailsByID ="SELECT * FROM fuel WHERE fuel_id=?";
	
	public static String updateFuelDetails = "UPDATE fuel SET fuel_name = ?, fuel_price = ?, fuel_description =? WHERE fuel_id=?;";

	public static String deleteFuelDetails = "DELETE FROM fuel WHERE fuel_id=? ";
}
