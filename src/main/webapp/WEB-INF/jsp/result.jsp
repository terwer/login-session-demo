<%--
  Created by IntelliJ IDEA.
  User: terwer
  Date: 2022/1/24
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>业务页面</title>
</head>
<body>
    <h1>Session:${pageContext.session.id}</h1>
    <p>登录成功。用户名：${sessionScope.username}</p>
</body>
</html>
