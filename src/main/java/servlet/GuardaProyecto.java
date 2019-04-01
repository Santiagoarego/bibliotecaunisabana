package servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "proyecto", 
        urlPatterns = {"/guardaProyecto"}
    )
public class GuardaProyecto extends HttpServlet{

    


    

    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        Arreglos client = Arreglos.constructora();

        if(!this.existeProyecto(req.getParameter("codigoProyecto"),client.getProyectos())){
        Proyecto pro = new Proyecto(req.getParameter("codigoProyecto"),
            req.getParameter("nombreProyecto"),Integer.parseInt(req.getParameter("duracionProyecto")),req.getParameter("plataformasDesarrollo"));
        client.guardaProyecto(pro);
        pw.println("<HTML><SCRIPT>alert(\"Proyecto registrado\"); window.history.back();</SCRIPT></HTML>");
        pw.close();
        }else{
            pw.println("<HTML><SCRIPT>alert(\"Codigo ya asignado\"); window.history.back();</SCRIPT></HTML>");
            pw.close();
        }
    }
    public boolean existeProyecto(String codigo, ArrayList<Proyecto> emp){
        boolean existe=false;
        for(int i=0; i<emp.size();i++) {
            if(emp.get(i).getCodigo().equals(codigo)){
                existe=true;
                break;
            }
            
        }
        return existe;
        
    }

}