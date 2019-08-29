<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
    <title>Add Fuel</title>
    <link rel="stylesheet" type="text/css" href="listfuel.css">
</head>
<body>
<div class="title">
    <a style="width:100%; text-decoration: none;" href="index.jsp">
        <h2 style="color: #FFFFFF;padding-left: 40%;">Fuel Management System</h2>
    </a>
</div>
<div class="limiter">
    <div class="container-table">
        <div class="wrap">
            <form method="POST" action="AllFuleDetails">
                <button type="submit" class="button" value="List All Fuel">Fuel List</button>
            </form>
            <h3 style="color: white" align="center">Add Fuel</h3>
            <form method="POST" action="AddFuleDetailsServelt">
                <table style="margin-left: 20%;color: white">

                    <tr>
                        <td style="width: 35%">Fuel Name</td>
                        <td><input class="input-area" type="text" name="fuel_name" required/></td>
                    </tr>
                    <tr>
                        <td>Fuel Price</td>
                        <td><input class="input-area" type="number" name="fuel_price" required/></td>
                    </tr>
                    <tr>
                        <td>Fuel Description</td>
                        <td><input class="input-area" type="text" name="fuel_description" required/></td>
                    </tr>
                   
                    <tr>
                        <td colspan="1"><input type="reset" value="Reset" class="button" /></td>
                        <td colspan="1"><input type="submit" value="Add Fuel" class="button" /> </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
</body>
</html>
