<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<script src="${pageContext.request.contextPath}/resources/socket.io/socket.io.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
<script>
  var socket = io.connect('http://localhost:8080');
  alert("됨");
  // 서버에 접속할 때, 사용자명을 확인한다.
  socket.on('connect', function(){
    // 서버에 있는 adduser 함수를 호출하며, 하나의 파라미터(prompt의 반환 값)를 전달한다
    socket.emit('adduser', prompt("What's your name?"));
  });

  // 리스너: 서버에서 updatechat을 전송할 때마다, 인자 함수가 실행하여 채팅 내용을 업데이트한다
  socket.on('updatechat', function (username, data) {
    $('#conversation').append('<b>'+username + ':</b> ' + data + '<br>');
  });

  // 리스너: 서버에서 updateusers을 전송할 때마다, 인자 함수가 실행하여 사용자 목록을 업데이트한다.
  socket.on('updateusers', function(data) {
    $('#users').empty();
    $.each(data, function(key, value) {
      $('#users').append('<div>' + key + '</div>');
    });
  });

  // 페이지 온로드 처리
  $(function(){
    // 클라이언트에서 SEND 버튼을 클릭할 때
    $('#datasend').click( function() {
      var message = $('#data').val();
      $('#data').val('');
      // 서버에서 sendchat 함수를 실행하도록 알려주며, 하나의 파라미터를 전달한다
      socket.emit('sendchat', message);
    });

    // 클라이언트에서 키보드의 엔터키를 입력할 때
    $('#data').keypress(function(e) {
      if(e.which == 13) {
        $(this).blur();
        // SEND 버튼의 클릭 이벤트를 실행한다
        $('#datasend').focus().click();
      }
    });
  });

</script>
<div style="float:left;width:100px;border-right:1px solid black;height:300px;padding:10px;overflow:scroll-y;">
  <b>USERS</b>
  <div id="users"></div>
</div>
<div style="float:left;width:300px;height:250px;overflow:scroll-y;padding:10px;">
  <div id="conversation"></div>
  <input id="data" style="width:200px;" />
  <input type="button" id="datasend" value="send" />
</div>
</body>
</html>