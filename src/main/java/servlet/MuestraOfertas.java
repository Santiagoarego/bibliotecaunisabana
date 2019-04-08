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

        Arreglos sing = Arreglos.constructora();
        pw.println("<HTML><head><TITLE>VENTAS</TITLE><link rel=\"stylesheet\" type=\"text/css\" href=\"/webbapp/proyectStyle.css\"></HEAD>");


        pw.println("<br>" + sing.getVentas().get(i).getNombre() + "<br>" + sing.getVentas().get(i).getLugar() + "<br>" + sing.getVentas().get(i).getNombreVendedor() +
                        "<br>" + sing.getVentas().get(i).getDescripcion() + "<br>" + sing.getVentas().get(i).getCantidad() + "<br>" + sing.getVentas().get(i).getFecha() + "<br>" + sing.getVentas().get(i).getPrecioBase());


                pw.println("<form action=\"generaOferta\" methor=\"POST\"> +
                        "Precio a ofertar<input type=\"number\" name=\"precioOferta\"><br>" +
                        "Cantidades a comprar<input type=\"number\" name=\"cantidadOferta\">" +
                        "<br><input type=\"submit\" value=\"Ofertar\"></form></HTML>");
        pw.close();


    }


}