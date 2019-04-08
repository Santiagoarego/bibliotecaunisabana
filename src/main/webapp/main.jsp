
<html>
<body>
<%@ page import="java.util.ArrayList" %>
<%@ page import="servlet.*"%>
<%@page contentType="text/html"%> 
<%@page pageEncoding="UTF-8"%> 
<%!
Arreglos sin = new Arreglos();

	ArrayList<Venta> ventas = Arreglos.getVentas();

%>
<%
	String valor ="";
	String valorbusq ="";
	valor = request.getParameter("sub");
	valorbusq = request.getParameter("buscar");

	String name="";
	String code="";
	String time="";
	String cost="";
	String plat="";
	
	if(valor.equals("Guardar"))
	{
		name=request.getParameter("nombreproyecto");
		code=request.getParameter("codigo");
		time=request.getParameter("tiempo").toString();
		cost=request.getParameter("presupuesto").toString();
		plat=request.getParameter("plataforma");
		codigos.add(code);
		datos.add("Código: " + code + " Nombre: " + name + " Tiempo: " + time +  " Presupuesto: " + cost + " Plataforma: " + plat);
		out.println("Datos Guardados");
	}
	
	else if(valor.equals("Buscar"))
	{
		for(int i=0; i<codigos.size(); i++)
		{
			if(valorbusq.equals(codigos.get(i)))
			{
				out.println(datos.get(i));
			}
		}
	}
%>
<p>Me ha llegado <%= request.getAttribute("unEntero") %></p>
</body>
</html>