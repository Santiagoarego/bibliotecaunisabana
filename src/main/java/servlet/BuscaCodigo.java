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

    


    //Uso Dopost porque mis method en html es post, si usan get pues usen doGet, la estructura es la misma

    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        //Creo un arreglos, mi arreglos es el singleton
        Arreglos client = Arreglos.constructora();
        //Traigo todos los proyectos del singleton
        ArrayList <Proyecto> pro= client.getProyectos();
        //Meto el codigo que quiero buscar en una variable
        String cod = req.getParameter("buscaCodigo");
        //Vainas que encontre en stackOverFlow jaja asies
        res.setContentType("text/html");
        //Sirven para printear un HTML como respuesta
        PrintWriter pw = res.getWriter();
        pw.println("<HTML><HEAD><TITLE>Busca Proyecto</TITLE></HEAD>");

        //Pues el ciclo que me busca coincidencia
        for(int i=0; i<pro.size();i++){
            if(pro.get(i).getCodigo().equals(cod)){
                
                pw.println( "Nombre: "+pro.get(i).getNombre()+"<br>Codigo: "+pro.get(i).getCodigo()+"<br>Duracion: "+pro.get(i).getDuracion()+" DIAS"
                +"<br>Plataformas: "+pro.get(i).getPlataformas());
            }
        }
        //Hay que decirle a la maquina cuando acabar jaja
        pw.close();

    }
        
    

    
       

}