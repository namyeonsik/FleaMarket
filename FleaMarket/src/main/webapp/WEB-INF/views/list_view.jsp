<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�Խñ� Ȯ��</title>
</head>
<body>
<table>
<tr>
<td class="list-group-item">${boardlist.bid}</td>
<td class="list-group-item">${boardlist.title}</td>
</tr>
</table>
<input type="button" value="ȭ����ȭ�ϱ�" onclick="window.open('chat.do', 'window�˾�', 'width=400, height=400, menubar=no, status=no, toolbar=no, top=200, left=200');">
</body>
</html>