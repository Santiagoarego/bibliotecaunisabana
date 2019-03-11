
<%@ page import="java.util.ArrayList" %>;
<%! ArrayList<String> codigos= new ArrayList();
ArrayList<String> datos = new ArrayList();
String concatenar="";
%>



	<%

codigos.add = request.getParameter("codigoProyecto");
concatenar = request.getParameter("nombreProyecto")+"\n"+ request.getParameter("duracionProyecto")+"\n"+ request.getParameter("plataformasDesarrollo") ;
datos.add = concatenar;

out.println(<html><body><script>alert("JSP");</script></body></html>);

	%>
