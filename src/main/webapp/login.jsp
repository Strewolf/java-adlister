<%--
  Created by IntelliJ IDEA.
  User: remonsmith
  Date: 3/9/23
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    String inputUsr = request.getParameter("username");
String inputPsw = request.getParameter("password");

    if (inputUsr != null && inputUsr.equals("admin") && inputPsw != null && inputPsw.equals("password")) {
        response.sendRedirect("/profile.jsp?username=" + inputUsr);
    } else {
        String message = "Invalid username or password";
        // add code to display the error message
    }

%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Login:</h1>
<% if(request.getAttribute("message") != null) { %>
<p><%= request.getAttribute("message") %></p>
<% } %>
<form action="login.jsp" method="post">
    Username:<input type="text" name="username"/><br/><br/>
    Password:<input type="password" name="password"/><br/><br/>
    <input type="submit" value="login"/>
</form>

</body>
</html>






<%--<%String message = "";--%>
<%--    String inputUsr = request.getParameter("admin");--%>
<%--    String inputPsw = request.getParameter("password");--%>

<%--    if (inputUsr != null && inputPsw != null && inputUsr.equals("admin") && inputPsw.equals("password")) {--%>
<%--        response.sendRedirect("profile.jsp?username=" + inputUsr);--%>
<%--    } else {--%>
<%--        message = "Invalid username or password";--%>
<%--        request.setAttribute("message", message);--%>
<%--        request.getRequestDispatcher("login.jsp").forward(request, response);--%>
<%--    }--%>
<%--%>--%>
