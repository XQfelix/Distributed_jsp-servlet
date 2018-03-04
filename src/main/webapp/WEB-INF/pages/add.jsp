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
	
	<form action="doAdd" method="post">
		学号:<input name="id"/><br>
		姓名:<input name="name"/><br>
		班级:<input name="bId"/><br>
		性别:<label><input name="gerden" type="radio" value="1"/>男</label>
			<label><input name="gerden" type="radio" value="0"/>女</label><br>
			<input type="submit"/>

	</form>
</body>
</html>