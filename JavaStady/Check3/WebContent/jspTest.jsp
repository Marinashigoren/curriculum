<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel ="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>

<!-- name、idの入力エリアを作成しなさい -->
<%@ include file="header.jsp" %>
	<form>
		<div>
			<label>name:</label><input type="text" placeholder="name">
		</div>
		<div>
			<label>pass:</label><input type="password" placeholder="password">
		</div>
	</form>
<%@ include file="footer.jsp" %>
</body>
</html>