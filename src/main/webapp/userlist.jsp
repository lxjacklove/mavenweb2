<%--
  Created by IntelliJ IDEA.
  User: Mr Li
  Date: 2019/4/23
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="" method="post">
        <table>
            <tr>
                <td>id</td>
                <td>用户名</td>
                <td>密码</td>
            </tr>
            <tr>
                <td><input type="checkbox" name="id" value="${dto.id}"/></td>
                <td>${dto.username}</td>
                <td>${dto.password}</td>
            </tr>
        </table>
    </form>
</body>
</html>
