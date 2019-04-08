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
        name = "manejooferta",
        urlPatterns = {"/manejoOferta"}
)
public class ManejoOferta extends HttpServlet {


    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        //Sirven para printear un HTML como respuesta
        int i = Integer.parseInt(req.getParameter("venta"));
        PrintWriter pw = res.getWriter();


        Arreglos sing = Arreglos.constructora();

        pw.println("<HTML><head><TITLE>VENTAS</TITLE><link rel=\"stylesheet\" type=\"text/css\" href=\"https://immense-shore-57264.herokuapp.com/proyectStyle.css\"></HEAD>");


        pw.println("<br>Correo Comprador: " + sing.getOfertas().get(i).getCorreoComprador() + "<br>Nombre oferta:" + sing.getOfertas().get(i).getNombreOferta() + "<br>Precio ofertado: " + sing.getOfertas().get(i).getPrecioOferta() +
                        "<br>Cantidad pedida:" + sing.getOfertas().get(i).getCantidadOferta() +
                        "<form action=\"edicionOferta\" method=\"POST\">"+
                "<br><br>Modificar precio<input type=\"radio\" name=\"venta\" value=\"mod\"><br>" +
                        "<br>Aceptar<input type=\"radio\" name=\"venta\" value=\"ace\"><br>" +
                        "<br>Eliminar<input type=\"radio\" name=\"venta\" value=\"el\"><br><br>" +
                        "<br>Chat: <input type=\"radio\" name=\"venta\" value=\"ch\">" +
                        "<input type=\"hidden\"  name=\"cust\" value=\""+i+"\"><br><input type=\"submit\" class=\"button\" value=\"Seleccionar opcion\"></form></HTML>");
        pw.close();


    }


}