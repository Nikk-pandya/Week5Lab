<%-- 
    Document   : login
    Created on : Feb 20, 2021, 8:43:52 PM
    Author     : 829364
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
     <form action="login" method="post">
            Username:<input type="text" name="username" value="${username}"><br>
            Password:<input type="password" name="password" value="${password}"<br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
