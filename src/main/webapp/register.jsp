<%--
  Created by IntelliJ IDEA.
  User: remonsmith
  Date: 3/16/23
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Please register" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
<h1>Please Register</h1>
<form action="/register" method="POST">
    <div class="form-group">
        <label for="rusername">Email</label>
        <input id="remail" name="username" class="form-control" type="text">
    </div>
    <div class="form-group">
        <label for="rusername">Username</label>
        <input id="rusername" name="username" class="form-control" type="text">
    </div>
    <div class="form-group">
        <label for="rpassword">Password</label>
        <input id="rpassword" name="password" class="form-control" type="password">
    </div>
    <input type="submit" class="btn btn-primary btn-block" value="register">
</form>
</div>
</body>
</html>
