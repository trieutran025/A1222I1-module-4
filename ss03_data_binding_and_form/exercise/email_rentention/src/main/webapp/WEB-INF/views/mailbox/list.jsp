<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
<table class="table">
    <thead class="thead-dark">
        <tr>
            <th scope="col">Language</th>
            <th scope="col">Page Size</th>
            <th scope="col">spams filter</th>
            <th scope="col">signature</th>
            <th scope="col">Action</th>
        </tr>
    </thead>
    <c:forEach items="${mails}" var="m">
        <tbody>
        <tr>
            <td>${m.language}</td>
            <td>${m.pageSize}</td>
            <td>${m.filter}</td>
            <td>${m.signature}</td>
            <td>
                <a href="/mailbox/update?id=${m.id}">Edit</a>
            </td>
        </tr>
        </tbody>
    </c:forEach>
</table>

</body>
</html>
