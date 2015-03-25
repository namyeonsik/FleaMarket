<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>FleaMarket</title>
<!-- <script type="text/javascript">
	function move() {
		location.href("http://localhost:8081/flea/join.do");
		
	}
</script> -->
</head>
<body>
<h1>
	main page
</h1>

<a href="join.do"><input type="button" value="login" id="btn"></a>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
