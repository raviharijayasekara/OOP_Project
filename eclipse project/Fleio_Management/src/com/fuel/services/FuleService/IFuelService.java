package com.fuel.services.FuleService;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import com.fuel.model.Fule.Fuel;


public interface IFuelService {

	public boolean addFuelDetails(Fuel fuel);

	public Fuel getFuelDetailsByID(String fuel_id);
	
	public ArrayList<Fuel> getFuelDetails();

	public boolean updateFuelDetails(Fuel fuel);

	public boolean removeFuelDetails(String fuel_id);

}
