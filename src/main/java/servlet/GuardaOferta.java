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
        name = "GO",
        urlPatterns = {"/guardaOferta"}
)
public class GuardaOferta extends HttpServlet {


    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        //Sirven para printear un HTML como respuesta
        PrintWriter pw = res.getWriter();
        HttpSession misession = (HttpSession) req.getSession();
        Venta miventa = (Venta) misession.getAttribute("estado");
        Arreglos sing = Arreglos.constructora();
        if (this.existeVendedor(req.getParameter("email"), sing.getCompradores(), req.getParameter("password")) && Integer.parseInt(req.getParameter("precioOferta")) >= miventa.getPrecioBase() && Integer.parseInt(req.getParameter("cantidadOferta")) <= miventa.getCantidad()) {
            Oferta ofer;
            ofer = new Oferta(miventa.getCorreoVendedor(), req.getParameter("email"), miventa.getNombre(), Integer.parseInt(req.getParameter("precioOferta")), Integer.parseInt(req.getParameter("cantidadOferta")));
            sing.guardaOferta(ofer);

            pw.println("<HTML><SCRIPT>alert(\"Oferta Registrado\"); </SCRIPT>");
            pw.println("<script>alert(\"guardo \" + miventa.getCorreoVendedor());window.history.back();</script>");
            pw.close();
        } else {
            pw.println("<HTML><SCRIPT>alert(\"Correo,contraseña, cantidad de articulos o precio erroneo\"); window.history.back();</SCRIPT></HTML>");
            pw.close();
        }


    }


    private boolean existeVendedor(String correo, ArrayList<Comprador> vend, String password) {
        boolean existe = false;
        for (int i = 0; i < vend.size(); i++) {
            if (vend.get(i).getCorreo().equals(correo) && vend.get(i).getPassword().equals(password)) {
                existe = true;
            }
        }
        return existe;
    }
}