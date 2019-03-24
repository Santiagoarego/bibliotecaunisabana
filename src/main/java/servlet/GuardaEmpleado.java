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
        name = "empleado", 
        urlPatterns = {"/guardaEmpleado"}
    )
public class GuardaEmpleado{

   

    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        Arreglos sing = Arreglos.constructora();

        Empleado emp = new Empleado(req.getParameter("documentoEmpleado"),
            req.getParameter("nombreEmpleado"),req.getParameter("apellidoEmpleado"),req.getParameter("cargoEmpleado"),
            req.getParameter("habilidadesEmpleado"));
        sing.guardaEmpleado(emp);
    }

}