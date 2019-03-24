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
        
        busca(req.getParameter("buscaDocumento"));
        
    }

    public void busca(String doc){
        Arreglos client = Arreglos.constructora();
        ArrayList <Empleado> emp= client.getEmpleados.size();
        
        for(int i=0; i<emp.size();i++){
            if(emp.get(i).getDocumento.equals(doc)){
                
                out.println("<html><body>Nombre: "+emp.get(i).getNombre+"<br>Appelidos: "+emp.get(i).getApellido+"<br>Cargo: "+emp.get(i).getCargo
                +"<br>Habilidades: "+emp.get(i).getHabilidades+ " </body></html>");
            }
        }

    }

}