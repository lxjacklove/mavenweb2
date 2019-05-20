<%--
  Created by IntelliJ IDEA.
  User: Mr Li
  Date: 2019/4/23
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/addUser.do" method="post">
        用户名：<input type="text" name="username"/><br>
        密码：<input type="password" name="password"/><br>
        <input type="submit" value="添加"/>
    </form>
</body>
</html>
