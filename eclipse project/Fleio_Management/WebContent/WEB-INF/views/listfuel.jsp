<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Fuel Management</title>
<link rel="stylesheet" type="text/css" href="listfuel.css">
</head>
<body>
	<div class="title">
		<a style="width: 100%; text-decoration: none;" href="index.jsp">
			<h2 style="color: #FFFFFF; padding-left: 40%;">Fuel Management
				System</h2>
		</a>
	</div>
	<div class="limiter">
		<div class="container-table">
			<div class="wrap">
				<form method="post" action="ViewAddFuelServelet">
					<button type="submit" class="button">Add Fuel</button>
				</form>
				<h3 style="color: white" align="center">Fuel List</h3>
				<div class="table100 ver1 m-b-110">
					<div class="table100-head">
						<table>
							<thread>
							<tr class="row100 head">
								<th class="cell100 column1">Fuel ID</th>
								<th class="cell100 column2">Fuel Name</th>
								<th class="cell100 column3">Fuel Price</th>
								<th class="cell100 column4">Fuel Description</th>

								<th class="cell100 column5">Change</th>
							</tr>
							</thread>
						</table>
					</div>
					<div class="table100-body js-pscroll ps ps--active-y">
						<table>
							<tbody>
								<c:forEach items="${fuleList}" var="fule">
									<tr>
										<th class="cell100 column1">${fule.fuel_id}</th>
										<th class="cell100 column2">${fule.fuel_name}</th>
										<th class="cell100 column3">${fule.fuel_price}</th>
										<th class="cell100 column4">${fule.fuel_description}</th>
										<th class="cell100 column5">
											<form method="POST" action="EditFuleDetails">
												<input type="hidden" name="fule_id" value=${fule.fuel_id}>
												<input type="submit" value="Change" class="select">
											</form>
										</th>
										
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
