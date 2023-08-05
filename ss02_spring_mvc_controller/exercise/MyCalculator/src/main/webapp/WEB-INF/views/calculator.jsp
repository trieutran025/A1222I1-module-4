<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Calculator</title>
    <style>
        fieldset{
            width: 700px;
            height: 150px;
        }
    </style>
</head>
<body>
<form method="post" action="/calculate">
    <fieldset>
        <legend>Calculator</legend>
        <div>
            <label>First Number
                <input type="number" name="firstNum" value="${firstNum}" placeholder="Hãy nhập số">
            </label>
            <label>Second Number
                <input type="number" name="secondNum" value="${secondNum}" placeholder="Hãy nhập số">
            </label>
        </div>
        <div>
            <label>
                <input type="radio" name="operator" value="add"checkedx/>add
            </label>
            <label>
                <input type="radio" name="operator" value="sub"/>sub
            </label>
            <label>
                <input type="radio" name="operator" value="mul"/>mul
            </label>
            <label>
                <input type="radio" name="operator" value="div"/>div
            </label>
        </div>
        <input type="submit" value="Submit">
    </fieldset>
    <c:choose>
        <c:when test="${result.naN}">
            <h1 style="color: red">${error}</h1>
        </c:when>
        <c:otherwise>
            <h1>Result ${operator} : ${result}</h1>
        </c:otherwise>
    </c:choose>
</form>
</body>
</html>
