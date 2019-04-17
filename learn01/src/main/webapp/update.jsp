<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/css.css">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	$(function(){
		$.post(
				"getStuById",
				{sid:$("[name='sid']").val()},
				function(json){
					var stu=json.stu;
					console.log(stu)
					$("[name='sname']").val(stu.sname)
					$("[name='sex']").val(stu.sex)
				},
				"json"		
		);
	})
	function update(){
		$.post(
				"update",
				$("form").serialize(),
				function(msg){
					if(msg){
						alert("修改成功");
						location="list";
					}else{
						alert("修改失败");
					}
				},
				"json"
		);
	}
</script>
</head>
<body>
	<form>
	<table>
		<tr>
			<td>编号</td>
			<td>
				<input type="text" name="sid" value="${param.sid }">
			</td>
		</tr>
		<tr>
			<td>姓名</td>
			<td>
				<input type="text" name="sname">
			</td>
		</tr>
		<tr>
			<td>性别</td>
			<td>
				<input type="text" name="sex">
			</td>
		</tr>
		<tr>
			<td></td>
			<td>
				<input type="button" value="修改" onclick="update()">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>