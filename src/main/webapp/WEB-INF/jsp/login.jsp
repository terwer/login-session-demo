<%--
  Created by IntelliJ IDEA.
  User: terwer
  Date: 2022/1/24
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <h1>Session:${pageContext.session.id}</h1>

    <p>${sessionScope.failMsg}</p>

    <form action="/login/login" method="post">
        <input type="text" name="username"><br/>
        <input type="password" name="password"><br/>
        <input type="submit" value="登录">
    </form>
</body>
</html>
