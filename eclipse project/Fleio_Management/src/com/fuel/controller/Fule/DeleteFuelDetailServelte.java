package com.fuel.controller.Fule;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fuel.model.Fule.Fuel;
import com.fuel.services.FuleService.FuelServiceImpl;
import com.fuel.services.FuleService.IFuelService;

@WebServlet("/DeleteFuelDetailServelte")
public class DeleteFuelDetailServelte extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fuel fuel = new Fuel();
		String fuel_id = request.getParameter("fule_id");
		
		IFuelService fuleService = new FuelServiceImpl();
		if(fuleService.removeFuelDetails(fuel_id)) {	
			RequestDispatcher rd1 = request.getRequestDispatcher("/AllFuleDetails");
			rd1.forward(request, response);					
		}else {
			request.setAttribute("fule", fuel);
			RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/views/changefuel.jsp");
			rd1.forward(request, response);			
		}
		
		
	}

}
