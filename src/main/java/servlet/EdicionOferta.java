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
        name = "edicionoferta",
        urlPatterns = {"/edicionOferta"}
)
public class EdicionOferta extends HttpServlet {


    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        //Sirven para printear un HTML como respuesta
        String obtener = req.getParameter("venta");
        int i = Integer.parseInt(req.getParameter("cust"));
        PrintWriter pw = res.getWriter();
        HttpSession misession = req.getSession(true);

        Arreglos sing = Arreglos.constructora();

        pw.println("<HTML><head><TITLE>VENTAS</TITLE><link rel=\"stylesheet\" type=\"text/css\" href=\"https://immense-shore-57264.herokuapp.com/proyectStyle.css\"></HEAD>");


        if(obtener.equals("ace")) {
            pw.println("<br>Correo" + sing.getOfertas().get(i).getCorreoVendedor()
            );
            for (int j = 0; j < sing.getVentas().size(); j++) {
                if (sing.getVentas().get(j).getCorreoVendedor().equalsIgnoreCase(sing.getOfertas().get(i).getCorreoVendedor())) {
                    sing.getVentas().get(j).setCantidad(sing.getVentas().get(j).getCantidad() - sing.getOfertas().get(i).getCantidadOferta());
                }
            }
            sing.getOfertas().remove(i);
        }else if(obtener.equals("mod")) {

            pw.println("<br>Nombre: " + sing.getVentas().get(i).getNombre() + "<br>Lugar: " + sing.getVentas().get(i).getLugar() + "<br>Nombre vendedor: " + sing.getVentas().get(i).getNombreVendedor() +
                    "<br>Descripcion: " + sing.getVentas().get(i).getDescripcion() + "<br>Cantidad disponible:" + sing.getVentas().get(i).getCantidad() + "<br>Fecha: " + sing.getVentas().get(i).getFecha() + "<br>Precio base: " + sing.getVentas().get(i).getPrecioBase() + "<br>S" +
                    "<br><br><form action=\"editarPrecio\" method POST><input type=\"number\" name=\"edit\" placeholder=\"Editar precio\"><input type=\"submit\" value=\"Cambiar\"></form>");
        }else if(obtener.equals("el")) {
            sing.getOfertas().remove(i);
        }else if(obtener.equals("ch")){

        }








        pw.close();


    }


}