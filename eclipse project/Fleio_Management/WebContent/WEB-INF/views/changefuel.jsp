<%@page import="com.fuel.model.Fule.Fuel"%>
<%@page import="com.fuel.controller.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Change Fuel</title>
<link rel="stylesheet" type="text/css" href="listfuel.css">
</head>
<body>
	<div class="title">
		<a style="width: 100%; text-decoration: none;" href="index.jsp">
			<h2 style="color: #FFFFFF; padding-left: 40%;">Fual Management
				System</h2>
		</a>
	</div>
	<div class="limiter">
		<div class="container-table">
			<div class="wrap">
				<form method="POST" action="AllFuleDetails">
					<button type="submit" class="button" value="List All Fuel">Back</button>
				</form>
				<h3 style="color: white" align="center">Change Fuel</h3>
				<%
					Fuel fuel = (Fuel) request.getAttribute("fule");
				%>

				<form method="POST" action="UpadateFuelDetailsServlet">
					<table style="margin-left: 20%; color: white">
						<tr>
							<td style="width: 35%">Fuel ID</td>
							<td><input class="input-area" type="text" name="fuel_id"
								disabled="disabled" value="<%=fuel.getFuel_id()%>"
								readonly="true" /></td>
						</tr>
						<tr>
							<td>Fuel Name</td>
							<td><input class="input-area" type="text" name="fuel_name"
								value="<%=fuel.getFuel_name()%>" /></td>
						</tr>
						<tr>
							<td>Fuel Price</td>
							<td><input class="input-area" type="number"
								name="fuel_price" value="<%=fuel.getFuel_price()%>" /></td>
						</tr>
						<tr>
							<td>Fuel Description</td>
							<td><input class="input-area" type="text"
								name="fuel_description" value="<%=fuel.getFuel_description()%>" /></td>
						</tr>


						<tr>

							<td colspan="1"><input type="hidden" name="fuel_id"
								value="<%=fuel.getFuel_id()%>" /> <input
								style="margin-left: 102%" type="submit" value="Update Fuel"
								class="button" /></td>
						</tr>
					</table>
				</form>
				<table>
					<td colspan="1">
						<form method="POST" action="DeleteFuelDetailServelte">
							<input type="hidden" name="fule_id"
								value="<%=fuel.getFuel_id()%>">
								 <input type="submit"
								value="Delete" class="button"  style="background-color: red"  />
						</form>
					</th>
					</td>

				</table>
			</div>
		</div>
	</div>

</body>
</html>
