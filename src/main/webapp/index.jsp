<html>
<body>
	<%! String completo =''%>
<h2>Me saque 5.0! Santiago Arevalo Gomez</h2>
<h3>Me saque 5</h3>
<form action="index.jsp" method="POST">
	First Name: <input type="text" name="first_name">
	<br>
	Last Name <input type="text" name="last-_name">
	<input type="submit" value="Ingresar">
</form>
<p><b>El nombre y apellidos son: </b>
	<%=completo=request.getParameter("first_name") + " "+ request.getParameter("last-_name")%>
</body>
</html>
