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
        name = "relacion", 
        urlPatterns = {"/guardaRelacion"}
    )
public class GuardaRelacion{

   

    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        Arreglos sing = Arreglos.constructora();

        Relacion res = new Relacion(req.getParameter("documentoEmpleado"),
            req.getParameter("nombreEmpleado"),req.getParameter("apellidoEmpleado"),req.getParameter("cargoEmpleado"),
            req.getParameter("habilidadesEmpleado"));
        sing.guardaEmpleado(emp);
    }

}