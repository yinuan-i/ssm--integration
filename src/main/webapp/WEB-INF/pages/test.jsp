<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ytyy
  Date: 2020/7/28
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>controller 已经成功搭建好了</h2>
<c:forEach items="${userlist}" var="i">
    ${i.userId}---${i.userName}----${i.userPwd} <br>
</c:forEach>
</body>
</html>
