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
public class GuardaProyecto{

    


    

    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        Arreglos client = Arreglos.constructora();
        Proyecto pro = new Proyecto(req.getParameter("codigoProyecto"),
            req.getParameter("nombreProyecto"),Integer.parseInt(req.getParameter("duracionProyecto")),req.getParameter("plataformasDesarrollo"));
        client.guardaProyecto(pro);
    }

}