
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Management</title>
</head>
<body>
<h3>Product Management</h3>
<p>
    <a th:href="@{/product/create}">
        Add new product
    </a>
</p>
<table id="product">
    <thead>
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Image</th>
    </tr>
    </thead>
    <tbody>
        <tr th:each="prodcut":${products}>
            <td th:text="${product.name}"></td>
            <td th:text="${product.description}"></td>
            <td><img width="100"height="100" th:src="@{'/newForder"></td>
        </tr>
    </tbody>
</table>

</body>
</html>
