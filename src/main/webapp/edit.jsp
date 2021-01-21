
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form  action="edit" method="post">
  <label>Please provide first name:</label>
  <input value=${student.getFirstName()} name="firstName">
  <label>Please provide last name:</label>
  <input value=${student.getLastName()} name="lastName">
  <label>Please provide age:</label>
  <input value=${student.getAge()} name="age">
  <button type="submit">Send</button>
</form>
</body>
</html>
