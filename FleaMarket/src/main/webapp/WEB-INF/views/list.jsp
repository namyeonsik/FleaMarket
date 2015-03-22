<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>채팅방 목록</title>
</head>
<body>

<div class="body">
		<div class="title">
			<h2>채팅방 목록</h2>
		</div>
		<div class="boardlist">
			<tr class="title">				
				<td>글번호 </td>
				<td>제목 </td>
				<td>작성자 </td>
				
				<br>
			</tr>

			<c:forEach items="${boardlist}" var="boardlist">
				<tr>
					<td class="list-group-item">${boardlist.bid}</td>
					<td class="list-group-item"><a href="list_view.do?bid=${boardlist.bid}">${boardlist.title}</a></td>
					<td class="list-group-item">${boardlist.mid}</td>
				</tr>
			</c:forEach>
		</div>

	</div>
	
</body>
</html>