<%--
  Created by IntelliJ IDEA.
  User: 79237
  Date: 2024/8/8
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Welcome to Login!</h2>
<form action="loginDeal.action">
    username:<input type="text" name="username"><br>
    password:<input type="password" name="password"><br>
    <input type="submit" value="login"/>
    <a href="regist.action"><input type="button" value="注册"></a>
</form>
</body>
</html>
