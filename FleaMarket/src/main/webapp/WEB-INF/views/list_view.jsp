<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<title>�Խñ� Ȯ��</title>
</head>
<body>
  <table class="table table-hover" style="width: 50%;margin-top: 5%;margin-left: 10%;">
    <thead>
      <tr>
        <th>�۹�ȣ</th>
        <th>������</th>
        <th>�̹���</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${boardlist.bid}</td>
        <td>${boardlist.title}</td>
        <td><img alt="" src="${pageContext.request.contextPath}/resources/images/${boardlist.image}"></td>
      </tr>
      <tr>
    </tbody>
  </table>

<input type="button" class="btn btn-default" style="margin-left: 10%" value="�ŷ��ϱ�" onclick="window.open('chat.do', 'window�˾�', 'width=900, height=400, scrollbars=yes,menubar=no, status=no, toolbar=no, top=100, left=200');">
</body>
</html>