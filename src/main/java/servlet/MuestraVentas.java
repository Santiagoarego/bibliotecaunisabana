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
        name = "Muestraventa",
        urlPatterns = {"/muestraVenta"}
)
public class MuestraVentas extends HttpServlet {


    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        //Sirven para printear un HTML como respuesta
        PrintWriter pw = res.getWriter();

        Arreglos sing = Arreglos.constructora();
        pw.println("<HTML><TITLE>VENTAS</TITLE>");
        for (int i = 0; i < sing.getVentas().size(); i++) {
            pw.println("<br>" + sing.getVentas().get(i).getNombre() + "<br>" + sing.getVentas().get(i).getLugar() + "<br>" + sing.getVentas().get(i).getNombreVendedor() +
                    "<br>" + sing.getVentas().get(i).getDescripcion() + "<br>" + sing.getVentas().get(i).getCantidad() +"<br>"+sing.getVentas().get(i).getFecha()+"<br>"+sing.getVentas().get(i).getPrecioBase()+"<br><br>");
        }
        pw.println("</HTML>");
        pw.close();


    }


}