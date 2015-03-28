<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/*.css"
	type="text/css">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link href='http://fonts.googleapis.com/css?family=Ubuntu'
	rel='stylesheet' type='text/css'>
<style type="text/css">
.center {
	margin-left: auto%;
	margin-right: auto%;
	width: 70%;
}

.center2 {
	margin-left: auto;
	margin-right: auto;
	width: 10%;
}
</style>
<title>게시판 글쓰기</title>
</head>
<body>


	<br>
	<br>



	<div class="container">

		<form action="insert.do" method="post" class="form-horizontal"
			enctype="multipart/form-data">

			<div class="form-group">
				<label class="control-label col-sm-1"> 제목</label>
				<div class="col-sm-10">
					<textarea class="form-control" rows="1" id="title" name="title"></textarea>
				</div>
			</div>

			<div class="form-group">

				<label class="control-label col-sm-1"> 카테고리</label>
				<div class="col-sm-3">
					<input type="text" id="category" name="category"
						class="form-control">
				</div>

				<label class="control-label col-sm-1">작성자</label>
				<div class="col-sm-2">
					<input type="text" readonly="readonly" id="mid" name="mid"
						class="form-control"
						value="${empty sessionScope.MemberDTO.mid?guest:sessionScope.MemberDTO.mid}">
				</div>

			</div>

			<div class="form-group">
				<label class="control-label col-sm-1">사진첨부</label>
				<div class="col-sm-10">
					<input type="file" name="pic" class="form-control">
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-11">
					<textarea class="form-control" rows="40" id="btext" name="btext"></textarea>
				</div>
			</div>

			<div align="right" style="margin-right: 10%">
				<div class="row">
					<div class="col-lg-12">
						<input type="submit" value="submit" class="btn btn-danger btn-sg">
						<input type="reset" class="btn btn-danger btn-mg" value="cancel">
					</div>
				</div>
			</div>
		</form>


	</div>



	<br>
	<br>

</body>
</html>