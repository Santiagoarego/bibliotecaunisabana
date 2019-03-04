<html>
<body>
	
<h2>Me saque 5.0! Santiago Arevalo Gomez</h2>
<h3>Me saque 5</h3>
<form action="index.jsp" method="GET">
	First Name: <input type="text" name="first_name">
	<br>
	Last Name <input type="text" name="last_name">
	<input type="submit" value="Ingresar">
</form>
<%! String nombre="",apellido="",total="";
%>


<p><b>El nombre y apellidos son: </b>
	<%

nombre = request.getParameter("first_name");
apellido = request.getParameter("last_name");
total = nombre +" "+ apellido;
if(nombre!=null){
out.print("<br>"+total);
}
	%>
</body>
</html>
