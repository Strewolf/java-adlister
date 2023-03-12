<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>title</title>
    <style>
        body {
            background: blue;
        }
    </style>
</head>
<body>
<h1>hello world</h1>
<script>
    'use strict'
        .body
    {
        alert("hey from codeup")
    }
</script>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
</body>
</html>
