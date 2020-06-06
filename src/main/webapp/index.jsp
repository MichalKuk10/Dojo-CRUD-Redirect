<%@ page import="Model.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<style>
    table, tr, th, td{
        border: 1px solid black;
    }
</style>
<head>
    <title>Dojo</title>
</head>
<body>
<%
ArrayList<Student> users = (ArrayList<Student>) request.getAttribute("entry");

%>

<a href="details.jsp">Add</a>

<table>
    <tr>
        <th>ID</th>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Age</th>
        <th>Actions</th>
    </tr>
    <%
        for(Student student : users){
    %>
    <tr>
        <td><%= student.getId() %> </td>
        <td><%= student.getFirstName() %></td>
        <td><%= student.getLastName() %></td>
        <td><%= student.getAge() %></td>
        <td><a href="#">Edit</a> <a href="#">Delete</a></td>
    </tr>

    <%
        }
    %>
</table>

</body>
</html>
