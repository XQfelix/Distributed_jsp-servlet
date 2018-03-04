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

<form action="doUpdate" method="post">
		学号:<input name="id" value="${stu.id }"/><br>
		姓名:<input name="name" value="${stu.name }"/><br>
		班级:<input name="bId" value="${stu.BId }"/><br>
		性别:<select name="gerden">
				<option value="1" <c:if test="${stu.gerden==1 }">selected="select"</c:if> >男</option>
				<option value="0" <c:if test="${stu.gerden==0 }">selected="select"</c:if> >女</option>
			</select><br>
			<input type="submit"/>

	</form>
</body>
</html>