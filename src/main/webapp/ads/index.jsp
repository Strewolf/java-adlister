<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />

<div class="container">
    <h1 class="text-center">Here Are all the ads!</h1>
    <hr>
    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6 text-center">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
            <hr>
        </div>
    </c:forEach>
</div>

</body>
</html>
