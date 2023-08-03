<%--
  Created by IntelliJ IDEA.
  User: Trieu
  Date: 8/3/2023
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Calculator</title>
</head>
<body>
<form method="post" action="/calculate">

    <input type="number" name="firstNum" value="${firstNum}">
    <input type="number" name="secondNum" value="${secondNum}"> <br><br>
    <input type="submit" value="addition(+)" name="calculations">
    <input type="submit" value="subtraction(-)" name="calculations">
    <input type="submit" value="multiplication(X)" name="calculations">
    <input type="submit" value="division(/)" name="calculations">
    <h1> Result ${calculations} : ${result}</h1>
</form>
</body>
</html>
