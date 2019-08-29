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

@WebServlet("/EditFuleDetails")
public class EditFuleDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		IFuelService fuleService = new FuelServiceImpl();		
		Fuel fule = fuleService.getFuelDetailsByID(request.getParameter("fule_id"));
		
		request.setAttribute("fule", fule);
		RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/views/changefuel.jsp");
		rd1.forward(request, response);
		
	}

}
