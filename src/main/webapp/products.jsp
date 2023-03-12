<%--
  Created by IntelliJ IDEA.
  User: remonsmith
  Date: 3/10/23
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="model.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<%-- Create some Product objects --%>
<% Product product1 = new Product("Product 1", 1000); %>
<% Product product2 = new Product("Product 2", 2000); %>
<% Product product3 = new Product("Product 3", 3000); %>

<%
    List<Product> products = new ArrayList<>(Arrays.asList(
    product1,
    product2,
    product3
    ));

    request.setAttribute("products", products);
%>
<%-- Display the products --%>
<%@ include file="partials/navbar.jsp" %>
    <c:forEach var = "product" items ="${products}">
    <div>
        <h3> ${product.name}</h3>
        <h3>${product.costInCents}</h3>
    </div>
    </c:forEach>
<%@ include file="partials/footer.jsp" %>
</body>
</html>
