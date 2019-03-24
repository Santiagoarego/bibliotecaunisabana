package servlet;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "buscaCodigo", 
        urlPatterns = {"/buscaCodigo"}
    )
public class BuscaCodigo extends HttpServlet{

    


    

    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        Arreglos client = Arreglos.constructora();
        ArrayList <Proyecto> pro= client.getProyectos();
        String cod = req.getParameter("buscaCodigo");
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<HTML><HEAD><TITLE>Busca Proyecto</TITLE></HEAD>");

        
        for(int i=0; i<pro.size();i++){
            if(pro.get(i).getCodigo().equals(cod)){
                
                pw.println( "Nombre: "+pro.get(i).getNombre()+"<br>Codigo: "+pro.get(i).getCodigo()+"<br>Duracion: "+pro.get(i).getDuracion()+" DIAS"
                +"<br>Plataformas: "+pro.get(i).getPlataformas());
            }
        }
        pw.close();

    }
        
    

    
       

}