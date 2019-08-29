package com.fuel.Util.Fule;


import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class FuelDBConnection{

    //Create Database Connection
    public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
    	Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_fuel", "root","mysql123root!@#");
		
		//creating table
		Statement statment = conn.createStatement();
		statment.execute(CommonConstant.createFuleTable);
		
		return conn;
    }
}

