
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Fual Management System</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="title">
  <h2 style="color: #FFFFFF;padding-left: 40%;">Fuel Management System</h2>
</div>

<div class="split left">
  <div class="centered">
    <form method="POST" action="AllFuleDetails">
      <input type="image" src="images/fuel.png" alt="Submit" class="centered-img"><br>
      <button style="margin-top: 10px" type="submit" class="button2">Fuel Management</button>
    </form>
  </div>
</div>
<div class="split right">
  <div class="centered">
    <form method="POST" action="ListCustomerServlet">
      <input type="image" src="images/customer.png" alt="Submit" class="centered-img">
      <button style="margin-top: 10px" type="submit" class="button2">Customer Management</button>
    </form>
  </div>
</div>



</body>
</html>
