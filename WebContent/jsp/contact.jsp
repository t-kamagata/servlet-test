<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../servlet/contact" method="post">
		<div>
			<label>氏名</label>
			<input type="text" name="name">
		</div>
		<div>
			<label>会社</label>
			<input type="text" name="company">
		</div>
		<div>
			<label>メールアドレス</label>
			<input type="text" name="mailAddress">
		</div>
		<div>
			<label>お問合せ内容</label>
			<input type="text" name="contact">
		</div>
		<fieldset>
			<legend>メルマガ種類</legend>
			<div>
				<input type="checkbox" name="mailType" value="general">
				<label>総合案内</label>
			</div>
			<div>
				<input type="checkbox" name="mailType" value="seminar">
				<label>セミナー案内</label>
			</div>
			<div>
				<input type="checkbox" name="mailType" value="jobs">
				<label>求人採用情報</label>
			</div>
		</fieldset>
		<fieldset>
			<legend>資料請求希望</legend>
			<div>
				<input type="radio" name="yesno" value="yes" checked>
				<label>Yes</label>
			</div>
			<div>
				<input type="radio" name="yesno" value="no">
				<label>No</label>
			</div>
		</fieldset>
		<input type="submit" value="提出">
	</form>
</body>
</html>