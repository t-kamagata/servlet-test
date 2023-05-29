<%@page import="servlet.FormBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>フォームの回答</h2>
	<div>
		<span>氏名</span>
		${ form.name }
	</div>
	<div>
		<span>会社</span>
		${ form.company }
	</div>
	<div>
		<span>メールアドレス</span>
		${ form.mailAddress }
	</div>
	<div>
		<span>お問合せ内容</span>
		${ form.contact }
	</div>
	<div>
		<span>メルマガ種類</span>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<c:forEach var="value" items="${ form.mailType }">
			${ value },
		</c:forEach>
	</div>
	<div>
		<span>資料請求希望</span>
		<% FormBean form = (FormBean) request.getAttribute("form"); %>
		<%= form.getNeedDocs() ? "はい" : "いいえ" %>
		<% if(form.getNeedDocs()) { %>
			<h3>この度は資料請求いただきありがとうございます。以下のリンクから資料ダウンロードが可能です</h3>
			<p><a href="https://www.google.com">https://www.example.com</a></p>
		<% } %>
	</div>
</body>
</html>