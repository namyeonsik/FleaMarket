<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>FleaMarket</title>
<script type="text/javascript">
	function move() {
		location.href("http://localhost:8080/flea/join.do");
	}
</script>
</head>
<body>
<h1>
	main page
</h1>

<button type="button" onclick="move();" class="btn btn-default">login</button>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
