
<%@ page import="java.util.ArrayList" %>
<%! ArrayList<String> codigos= new ArrayList();
ArrayList<String> datos = new ArrayList();
String concatenar="",btn="";
%>



	<%
	btn=request.getParameter("btn");
	if(btn.equals("Guardar Proyecto")){
		codigos.add(request.getParameter("codigoProyecto"));
		concatenar = request.getParameter("nombreProyecto")+"\n"+ request.getParameter("duracionProyecto")+"\n"+ request.getParameter("plataformasDesarrollo");
		datos.add( concatenar);
		out.println("<html><body><script>alert(\"REGISTRAR\")</script></body></html>");
	}
	else if(btn.equals("Buscar")){
	
	out.println("<html><body><script>alert(\"BUSCAR\")</script></body></html>");
	out.println("<br>"+datos.get(codigos.indexOf(request.getParameter("buscaProyecto"))));
}


	%>
