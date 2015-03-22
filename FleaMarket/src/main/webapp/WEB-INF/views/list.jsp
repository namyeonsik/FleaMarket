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
			<ul class="title">				
				<li>글 번호</li>
				<li>제목</li>
				<li>작성자</li>
			</ul>

			<c:forEach items="${boardlist}" var="boardlist">
				<ul>
					<li class="list-group-item">${boardlist.bid}</li>
					<li class="list-group-item">${boardlist.title}</li>
					<li class="list-group-item">${boardlist.mid}</li>
				</ul>
			</c:forEach>
		</div>

	</div>
	
</body>
</html>