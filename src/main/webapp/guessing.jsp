<%--
  Created by IntelliJ IDEA.
  User: remonsmith
  Date: 3/13/23
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<form action="guess" method="post">
    <label for="guess">Guess a number between 1 and 3:</label>
    <input type="number" id="guess" name="guess" min="1" max="3" required>
    <button type="submit">Submit</button>
</form>

</body>
</html>
