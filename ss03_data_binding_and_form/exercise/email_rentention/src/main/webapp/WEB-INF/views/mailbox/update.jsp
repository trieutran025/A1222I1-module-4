<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Mailbox</title>
    <style>
    </style>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
            crossorigin="anonymous"></script>
</head>
<body>
<form:form method="post" action="update" modelAttribute="mailbox">
    <form:hidden path="id"/>
    <table>
        <tr>
            <th>Language</th>
            <td colspan="2">
                <form:select path="language" items="${languages}"/>
            </td>
        </tr>
        <tr>
            <th>Page Size</th>
            <td>
                <span>Show <form:select path="pageSize" items="${pageSize}"/> emails per page</span>
            </td>
        </tr>
        <tr>
            <th>Spams Filter</th>
            <td>
                <form:checkbox path="filter" value="Enable"/>Enable spams filter
            </td>
        </tr>
        <tr>
            <th>Signature</th>
            <td>
                <form:textarea path="signature"/>
            </td>
        </tr>
    </table>
    <input type="submit" value="Update">
    <input type="reset"value="Cancel">
</form:form>
</body>
</html>
