<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Home</title>
 <script src="<c:url value="/resources/js/main.js" />"></script>
</head>
<body>
<div id="container">
<h1> Login view</h1>
<div id="loginblock">
<div id="inputblock">
<form action="user" method="POST">
UserName : <input type="text" name="username"/><br/>
Password : <input type="password" name="userpassword"/><br>
<input type="submit" value="Login"/>
</form>
</div>
</div>
</div>

</body>
</html>