<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Sandwich</title>
</head>
<body>
<form method="post" action="/save">
    <fieldset>
        <legend>Gia vị Sandwich</legend>
    <table>
        <tr>
            <td><input type="checkbox" name="condiment" value="Lettuce">Lettuce</td>
            <td><input type="checkbox" name="condiment" value="Tomato">Tomato</td>
            <td><input type="checkbox" name="condiment" value=" Mustard">Mustard</td>
            <td><input type="checkbox" name="condiment" value="Sprouts">Sprouts</td>
        </tr>
        <tr>
            <td><input type="submit" value="Save"></td>
        </tr>
        <tr>
            <td colspan="4">Nhung gia vi dung de an sandwich : ${result}</td>
        </tr>
    </table>
    </fieldset>
</form>
</body>
</html>
