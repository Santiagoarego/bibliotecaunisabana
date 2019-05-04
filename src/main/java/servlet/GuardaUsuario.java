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
        name = "usuario",
        urlPatterns = {"/guardaUsuario"}
    )
public class GuardaUsuario extends HttpServlet{

   

    public void doPost  (HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        res.setContentType("text/html");
        //Sirven para printear un HTML como respuesta
        PrintWriter pw = res.getWriter();
        
        Arreglos sing = Arreglos.constructora();
        if(!this.existeComprador(req.getParameter("correoUsuario"),sing.getCompradores()) && !(this.existeVendedor(req.getParameter("correoUsuario"),sing.getVendedores()))){
            if(req.getParameter("USER").equals("c")){
                Comprador comp = new Comprador(req.getParameter("correoUsuario"),req.getParameter("passwordUsuario"));
                sing.guardaComprador(comp);
            }else if(req.getParameter("USER").equals("v")){
                Vendedor vend = new Vendedor(req.getParameter("correoUsuario"),req.getParameter("passwordUsuario"));
                sing.guardaVendedor(vend);
            }
            pw.println("<HTML><SCRIPT>alert(\"Yeisson es gay\"); window.history.back();</SCRIPT></HTML>");
            pw.close();
        }else{
            pw.println("<HTML><SCRIPT>alert(\"El correo ya se está usando\"); window.history.back();</SCRIPT></HTML>");
            pw.close();
        }

    }

    public boolean existeVendedor(String correo, ArrayList<Vendedor> emp){
        boolean existe=false;
        for(int i=0; i<emp.size();i++) {
            if(emp.get(i).getCorreo().equals(correo)){
                existe=true;
                
                break;
            }
            
        }
        return existe;
        
    }
    public boolean existeComprador(String correo, ArrayList<Comprador> emp){
        boolean existe=false;
        for(int i=0; i<emp.size();i++) {
            if(emp.get(i).getCorreo().equals(correo)){
                existe=true;
                break;
            }

        }
        return existe;

    }

}
