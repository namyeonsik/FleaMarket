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
  alert("��");
  // ������ ������ ��, ����ڸ��� Ȯ���Ѵ�.
  socket.on('connect', function(){
    // ������ �ִ� adduser �Լ��� ȣ���ϸ�, �ϳ��� �Ķ����(prompt�� ��ȯ ��)�� �����Ѵ�
    socket.emit('adduser', prompt("What's your name?"));
  });

  // ������: �������� updatechat�� ������ ������, ���� �Լ��� �����Ͽ� ä�� ������ ������Ʈ�Ѵ�
  socket.on('updatechat', function (username, data) {
    $('#conversation').append('<b>'+username + ':</b> ' + data + '<br>');
  });

  // ������: �������� updateusers�� ������ ������, ���� �Լ��� �����Ͽ� ����� ����� ������Ʈ�Ѵ�.
  socket.on('updateusers', function(data) {
    $('#users').empty();
    $.each(data, function(key, value) {
      $('#users').append('<div>' + key + '</div>');
    });
  });

  // ������ �·ε� ó��
  $(function(){
    // Ŭ���̾�Ʈ���� SEND ��ư�� Ŭ���� ��
    $('#datasend').click( function() {
      var message = $('#data').val();
      $('#data').val('');
      // �������� sendchat �Լ��� �����ϵ��� �˷��ָ�, �ϳ��� �Ķ���͸� �����Ѵ�
      socket.emit('sendchat', message);
    });

    // Ŭ���̾�Ʈ���� Ű������ ����Ű�� �Է��� ��
    $('#data').keypress(function(e) {
      if(e.which == 13) {
        $(this).blur();
        // SEND ��ư�� Ŭ�� �̺�Ʈ�� �����Ѵ�
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