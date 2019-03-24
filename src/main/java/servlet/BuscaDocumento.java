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
        name = "buscaDocumento", 
        urlPatterns = {"/buscaDocumento"}
    )
public class GuardaProyecto extends HttpServlet{

    


    

    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        Arreglos client = Arreglos.constructora();
        ArrayList <Empleado> emp= client.getEmpleados();
        String doc = req.getParameter("buscaDocumento");
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<HTML><HEAD><TITLE>Busca Empleado</TITLE></HEAD>");

        
        for(int i=0; i<emp.size();i++){
            if(emp.get(i).getDocumento().equals(doc)){
                
                pw.println( "Nombre: "+emp.get(i).getNombre()+"<br>Appelidos: "+emp.get(i).getApellido()+"<br>Cargo: "+emp.get(i).getCargo()
                +"<br>Habilidades: "+emp.get(i).getHabilidades());
            }
        }
        pw.close();

    }
        
    }

    
       

}