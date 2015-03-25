<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ä�ù� ���</title>
<style type="text/css">

.title {margin-left: 40%;}
.boardlist {
	width: 90%;
	margin-top: 5%;
	margin-left: 20%;

}

.boardlist ul {
	clear: left;
	margin: 0;
	padding: 0;
	list-style-type: none;
	
}

.boardlist .title {
	font-weight: bold;
	text-align: center;
}

.boardlist ul li {
	text-align: center;
	float: left;
	margin: 0;
	padding: 2px, 1px;
	width: 240px;
	height: 40px;
	border-left: 1px solid #000;
	border-top: 1px solid #000;
	border-bottom: 1px solid #000;
}

/* .boardlist ul .list-group-item list-group-item-lightblue {
	width: 239px;
} /* ǥ ���� ���߱�� ����*/ */
.boardlist ul .col1 {
	width: 239px;
}
.boardlist ul .col3 {
	width: 239px;
	 border-right: 1px solid #000;
}
</style>
</head>
<body>

<div class="body">
		<div class="title">
			<h1>ä�ù� ���</h1>
		</div>
		
		<a href="insert.do"><input type="button" value="�� ����ϱ�" id="btn"></a>
		<div class="boardlist">
			<ul class="title">				
				<li class="col1">�۹�ȣ </li>
				<li class="col1">���� </li>
				<li class="col3">�ۼ��� </li>
				
				<!-- <br> -->
			</ul>

			<c:forEach items="${boardlist}" var="boardlist">
				<ul>
					<li class="col1">${boardlist.bid}</li>
					<li class="col1"><a href="list_view.do?bid=${boardlist.bid}">${boardlist.title}</a></li>
					<li class="col3">${boardlist.mid}</li>
				</ul>
			</c:forEach>
		</div>



	</div>
	
</body>
</html>