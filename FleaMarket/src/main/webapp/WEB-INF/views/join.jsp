<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<title>join</title>

<script type="text/javascript">
	function validationcheck() {
		var mid = myfrm.mid.value;
		var name = myfrm.name.value;
		var pwd = myfrm.pwd.value;
		if (mid == "" || mid == null) {
			alert("아이디을 입력하세요.");
			myfrm.mid.focus();
			return false; //list로 넘어감 방지	
		} else if (phonenumber == "" || phonenumber == null) {
			alert("연락처를 입력하세요.");
			myfrm.phonenumber.focus();
			return false;
		}else if (name == "" || name == null) {
			alert("이름을 입력하세요.");
			myfrm.name.focus();
			return false;
		}else if (pwd == "" || pwd == null) {
			alert("비밀번호를 입력해주세요.");
			myfrm.pwd.focus();
			return false;
		}else {
			return true;
		}
	}
	function validationlogin() {
		var mid = loginfrm.mid.value;
		var pwd = loginfrm.pwd.value;
		if (mid == "" || mid == null) {
			alert("아이디를 입력하세요.");
			loginfrm.mid.focus();
			return false; //list로 넘어감 방지

		} else if (pwd == "" || pwd == null) {
			alert("비밀번호를 입력하세요.");
			loginfrm.pwd.focus();
			return false;
		} else {
			return true;
		}
	}
</script>
</head>
<body>
<div class="container">
  <h2>Join</h2>
  <form role="form" action="join.do" onsubmit="validationcheck();" method="post" name="myfrm">
    <div class="form-group">
      <label for="mid">Id:</label>
      <input type="text" class="form-control" id="mid" name="mid">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" name="pwd">
    </div>
    <div class="form-group">
      <label for="mname">Name:</label>
      <input type="text" class="form-control" id="name" name="name">
    </div>
    <div class="form-group">
      <label for="mphone">Phone:</label>
      <input type="text" class="form-control" id="phonenumber" name="phonenumber">
    </div>
    <button type="submit" class="btn btn-default">join</button>
  </form>
</div>

<div class="container">
  <h2>login</h2>
  <form role="form" name="loginfrm" onsubmit="validationlogin();" method="post" action="login.do">
    <div class="form-group">
      <label for="mid">Id:</label>
      <input type="text" class="form-control" name="mid">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" name="pwd">
    </div>
    <button type="submit" class="btn btn-default">login</button>
  </form>
</div>

</body>
</html>