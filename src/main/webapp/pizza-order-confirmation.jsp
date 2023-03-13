
<%--
  Created by IntelliJ IDEA.
  User: remonsmith
  Date: 3/13/23
  Time: 12:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Pizza Order Confirmation</title>
</head>
<body>
<h1>Thank you for your pizza order!</h1>

<p>Your order details:</p>
<ul>
    <li>Crust type: ${requestScope.crustType}</li>
    <li>Sauce type: ${requestScope.sauceType}</li>
    <li>Size type: ${requestScope.sizeType}</li>
    <li>Toppings:
        <c:forEach var="topping" items="${requestScope.toppings}">
            ${topping}
        </c:forEach>
    </li>
    <li>Delivery address: ${requestScope.deliveryAddress}</li>
</ul>
</body>
</html>