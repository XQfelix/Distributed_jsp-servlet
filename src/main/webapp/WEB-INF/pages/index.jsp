<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="goAdd">添加学生</a>
	<table>
		<thead>
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>班级</th>
			<th>性别</th>
		</tr>
		</thead>
		<tbody>
			<c:forEach var="stu" items="${student }">
				<tr>
					<td>${stu.id }</td>
					<td>${stu.name }</td>
					<td>
						<c:choose>
							<c:when test="${stu.BId==1 }">一班</c:when>
							<c:when test="${stu.BId==2 }">二班</c:when>
							<c:when test="${stu.BId==3 }">三班</c:when>
							<c:when test="${stu.BId==4 }">四班</c:when>
							<c:when test="${stu.BId==5 }">五班</c:when>
							<c:when test="${stu.BId==6 }">六班</c:when>						
						</c:choose>
					</td>
					<td>
						<c:choose>
							<c:when test="${stu.gerden==1 }">男</c:when>
							<c:when test="${stu.gerden==0 }">女</c:when>							
						</c:choose>
						<a href="goUpdate?id=${stu.id }">修改</a>
						<a href="doDel?id=${stu.id }">删除</a>
					</td>
				</tr>
				
				
			</c:forEach>
		</tbody>




</body>
</html>