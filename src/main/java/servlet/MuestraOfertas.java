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
        name = "muestraoferta",
        urlPatterns = {"/muestraOfertas"}
)
public class MuestraOfertas extends HttpServlet {


    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        //Sirven para printear un HTML como respuesta
        int i = Integer.parseInt(req.getParameter("venta"));
        PrintWriter pw = res.getWriter();
        HttpSession misession= req.getSession(true);

        Arreglos sing = Arreglos.constructora();
        misession.setAttribute("estado",sing.getVentas().get(i));
        pw.println("<HTML><head><TITLE>VENTAS</TITLE><link rel=\"stylesheet\" type=\"text/css\" href=\"/webbapp/proyectStyle.css\"></HEAD>");


        pw.println("<br>" + sing.getVentas().get(i).getNombre() + "<br>" + sing.getVentas().get(i).getLugar() + "<br>" + sing.getVentas().get(i).getNombreVendedor() +
                        "<br>" + sing.getVentas().get(i).getDescripcion()
                + "<br>" + sing.getVentas().get(i).getCantidad() + "<br>" + sing.getVentas().get(i).getFecha()
                + "<br>" + sing.getVentas().get(i).getPrecioBase());


                pw.println("<form action=\"guardaOferta\" methor=\"GET\">" +
                        "Precio a ofertar<input type=\"number\" name=\"precioOferta\"><br>" +
                        "Cantidades a comprar<input type=\"number\" name=\"cantidadOferta\">" +
                        "<input type=\"email\" class=\"inputdata\" name=\"email\" placeholder=\"e-mail del comprador ...\"><br>\n" +
                        "            <input type=\"password\" class=\"inputdata\" name=\"password\" placeholder=\"contraseña del vendedor ...\"><br>" +

                        "<br><input type=\"submit\" value=\"Ofertar\"></form></HTML>");
        pw.close();


    }


}