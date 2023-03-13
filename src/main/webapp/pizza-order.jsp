<%--
  Created by IntelliJ IDEA.
  User: remonsmith
  Date: 3/13/23
  Time: 12:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Pizza Order Form</h1>
<form action="${pageContext.request.contextPath}/pizza-order" method="post">
    <label for="crustType">Crust Type:</label>
    <select name="crustType">
        <option value="thin">Thin</option>
        <option value="thick">Thick</option>
        <option value="deep-dish">Deep Dish</option>
    </select><br/><br/>

    <label for="sauceType">Sauce Type:</label>
    <select name="sauceType">
        <option value="tomato">Tomato</option>
        <option value="alfredo">Alfredo</option>
        <option value="bbq">BBQ</option>
    </select><br/><br/>

    <label for="sizeType">Size Type:</label>
    <select name="sizeType">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select><br/><br/>

    <label for="toppings">Toppings:</label><br/>
    <input type="checkbox" name="toppings" value="pepperoni">Pepperoni<br/>
    <input type="checkbox" name="toppings" value="sausage">Sausage<br/>
    <input type="checkbox" name="toppings" value="mushrooms">Mushrooms<br/>
    <input type="checkbox" name="toppings" value="olives">Olives<br/>
    <input type="checkbox" name="toppings" value="onions">Onions<br/><br/>

    <label for="deliveryAddress">Delivery Address:</label><br/>
    <input type="text" name="deliveryAddress"><br/><br/>

    <input type="submit" value="Place Order">
</form>
</body>
</html>
