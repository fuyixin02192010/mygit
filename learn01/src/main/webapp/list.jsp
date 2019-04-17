<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/css.css">
<script type="text/javascript"  src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	function add(){
		location="add.jsp";
	}
	function upd(sid){
		location="update.jsp?sid="+sid;
	}
</script>
</head>
<body>
	<form action="list" method="post">
		姓名：<input type="text" name="sname" value="${sname }">
		<input type="submit" value="搜索">
	</form>
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="s">
			<tr>
			<td>${s.sid }</td>
			<td>${s.sname }</td>
			<td>${s.sex }</td>
			<td>
				<input type="button" value="添加" onclick="add()">
				<input type="button" value="修改" onclick="upd(${s.sid })">
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5">
				${fenye }
			</td>
		</tr>
	</table>
</body>
</html>