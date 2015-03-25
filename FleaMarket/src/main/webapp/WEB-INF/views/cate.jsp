<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>카테고리</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="jumbotron.css" rel="stylesheet">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>

<body>
    <div class="jumbotron">
      <div class="container">
        <h1>플리마켓 카테고리</h1>
        <p>다음 카테고리를 선택한 후 직접 방송을 통해 원하시는 물품을 확인하실 수 있습니다.</p>
      </div>
    </div>

    <div class="container">
      <div class="row">
        <div class="col-lg-4">
          <h2><a href="list.do?category=1">의류</a></h2>
          <p>여성 상의</p>
          <p>여성 하의</p>
          <p>남성 상의</p>
          <p>남성 상의</p>
        </div>
        <div class="col-lg-4">
          <h2><a href="list.do?category=2">잡화</a></h2>
          <p>운동화</p>
          <p>구두</p>
          <p>가방/패셥잡화</p>
          <p>쥬얼리/시계/선글라스</p>
          <p>화장품</p>
        </div>
        
        <div class="col-lg-4">
          <h2><a href="list.do?category=3">가구/생활</a></h2>
          <p>침구/커튼</p>
          <p>조명</p>
          <p>욕실/수납용품</p>
          <p>주방용품</p>
          <p>기타생활용품</p>
        </div>
        
        <div class="col-lg-4">
          <h2><a href="list.do?category=4">가전</a></h2>
          <p>TV/홈씨어터</p>
          <p>주방가전</p>
          <p>냉장고/세탁기/청소기</p>
          <p>냉난방/청정/제습</p>
        </div>
        
        <div class="col-lg-4">
          <h2><a href="list.do?category=5">디지털</a></h2>
          <p>노트북/데스크탑</p>
          <p>카메라/캠코더</p>
          <p>휴대폰/악세사리</p>
          <p>이어폰/헤드폰/스피커</p>
          <p>게임기/eBook/MP3</p>
        </div>
        
        <div class="col-lg-4">
          <h2><a href="list.do?category=6">스포츠/자동차</a></h2>
          <p>자전거/헬스</p>
          <p>골프의류/용품</p>
          <p>등산/캠핑/낚시/보드</p>
          <p>블랙박스/네비</p>
          <p>자동차/모터바이크</p>
          <p>공구/기타용품</p>
        </div>
      </div>

      <hr>

      <footer>
        <p>&copy; FleaMaket 2015</p>
      </footer>
    </div> 

    
    <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한) -->
    <script src="//code.jquery.com/jquery.js"></script>
    <!-- 모든 합쳐진 플러그인을 포함하거나 (아래) 필요한 각각의 파일들을 포함하세요 -->
    <script src="js/bootstrap.min.js"></script> 
    <!-- Respond.js 으로 IE8 에서 반응형 기능을 활성화하세요 (https://github.com/scottjehl/Respond) -->
    <script src="js/respond.js"></script>
</body>
</html>