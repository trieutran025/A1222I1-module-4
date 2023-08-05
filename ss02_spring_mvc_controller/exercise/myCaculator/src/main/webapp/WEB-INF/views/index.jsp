<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Calculator</title>
    <style>
        fieldset{
            width: 500px;
            height: 130px;
        }
    </style>
</head>
<body>
<form method="post" action="/calculate">
    <fieldset>
        <legend>Calculator</legend>
    <input type="number" name="firstNum" value="${firstNum}">
    <input type="number" name="secondNum" value="${secondNum}"> <br><br>
    <input type="radio" value="add" name="calculations"checked>addition(+)
    <input type="radio" value="sub" name="calculations">subtraction(-)
    <input type="radio" value="mul" name="calculations">multiplication(X)
    <input type="radio" value="div" name="calculations">division(/)<br><br>
    <input type="submit"value="calculator">
    </fieldset>
    <h1> Result ${calculations} : ${result}</h1>
</form>
</body>
</html>
