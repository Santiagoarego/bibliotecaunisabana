package servlet;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(
        name = "veroferta",
        urlPatterns = {"/verOfertas"}
)
public class VerOfertas extends HttpServlet {


    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        //Sirven para printear un HTML como respuesta

        PrintWriter pw = res.getWriter();
        //HttpSession misession= req.getSession(true);

        Arreglos sing = Arreglos.constructora();
        //misession.setAttribute("estado",sing.getVentas().get(i));
        pw.println("<HTML><head><TITLE>VENTAS</TITLE><link rel=\"stylesheet\" type=\"text/css\" href=\"https://immense-shore-57264.herokuapp.com/proyectStyle.css\"></HEAD>");

        for (int i = 0; i < sing.getOfertas().size(); i++) {
            pw.println("<form action=\"manejoOferta\" method=\"POST\">");
            if (sing.getOfertas().get(i).getCorreoVendedor().equalsIgnoreCase(req.getParameter("correoUsuario"))) {
                pw.println("<br>asasaCorreo Comprador: " + sing.getOfertas().get(i).getCorreoComprador() + "<br>Nombre oferta:" + sing.getOfertas().get(i).getNombreOferta() + "<br>Precio ofertado: " + sing.getOfertas().get(i).getPrecioOferta() +
                        "<br>Cantidad pedida:" + sing.getOfertas().get(i).getCantidadOferta()+

                "<br>Seleccionar<input type=\"radio\" name=\"venta\" value=\""+i+"\"><br><br>");
            }
        }
        pw.println("<input type=\"submit\" class=\"button\" value=\"Seleccionar oferta\"></form></HTML>");
        pw.close();








    }


}