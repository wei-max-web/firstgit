<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<body>
<form action="select2.action" method="post">
<input name = "txt">
<input type="submit" value="查询">
</form>
<a href="add.jsp">新增</a>
<table>
<tr><td>id</td><td>name</td><td>操作</td></tr>
<c:forEach items="${list}" var = "row" varStatus="v">
<tr><td>${row.id}</td>
   <td>${row.name}</td>
    <td>
	<a href="delete.action?id=${row.id}">删除</a>
	<a href="update2.action?id=${row.id}&name=${row.name}">修改</a>
	</td>
</tr>
</c:forEach>
</table>
</body>
</html>