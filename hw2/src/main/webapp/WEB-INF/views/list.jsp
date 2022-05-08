<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>List of all films</title>
</head>
<body>
	<c:forEach items="${films}" var="film">
	<p>${film.toString()}
	</p>
	</c:forEach>
</body>
</html>