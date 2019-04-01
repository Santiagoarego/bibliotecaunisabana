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
        name = "empleado", 
        urlPatterns = {"/guardaEmpleado"}
    )
public class GuardaEmpleado extends HttpServlet{

   

    public void doPost  (HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        res.setContentType("text/html");
        //Sirven para printear un HTML como respuesta
        PrintWriter pw = res.getWriter();
        
        Arreglos sing = Arreglos.constructora();
        if(!this.existeEmpleado(req.getParameter("documentoEmpleado"),sing.getEmpleados())){
            Empleado emp = new Empleado(req.getParameter("documentoEmpleado"),
                req.getParameter("nombreEmpleado"),req.getParameter("apellidoEmpleado"),req.getParameter("cargoEmpleado"),
                req.getParameter("habilidadesEmpleado"));
            sing.guardaEmpleado(emp);
        }else{
            pw.println("<HTML><SCRIPT>alert(\"Ya Esta Registrado\"); window.history.back();</SCRIPT></HTML>");
            pw.close();
        }

    }

    public boolean existeEmpleado(String documento, ArrayList<Empleado> emp){
        boolean existe=false;
        for(int i=0; i<emp.size();i++) {
            if(emp.get(i).getDocumento().equals(documento)){
                existe=true;
                break;
            }
            
        }
        return existe;
        
    }

}