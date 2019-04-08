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
        name = "venta",
        urlPatterns = {"/guardaVenta"}
)
public class GuardaVenta extends HttpServlet {


    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        //Sirven para printear un HTML como respuesta
        PrintWriter pw = res.getWriter();

        Arreglos sing = Arreglos.constructora();
        if (this.existeVendedor(req.getParameter("email"), sing.getVendedores(),req.getParameter("password"))) {
            Venta vent;
            vent = new Venta(req.getParameter("correoVendedor"), req.getParameter("nombreProducto"), req.getParameter("lugarProcedencia")
                    , req.getParameter("nombreVendedor"), req.getParameter("descripcionProducto"), Integer.parseInt(req.getParameter("unidadesDisponibles")),
                    req.getParameter("fecha"), Integer.parseInt(req.getParameter("precioUnidad")));
            sing.guardaVenta(vent);
            req.setAttribute("unEntero", new Integer(22));

            resp.getRequestDispatcher("destino.jsp").forward(req, resp);
            pw.println("<HTML><SCRIPT>alert(\"Venta Registrado\"); window.history.back();</SCRIPT></HTML>");
            pw.close();
        }else{
            pw.println("<HTML><SCRIPT>alert(\"Correo o contraseña erroneo\"); window.history.back();</SCRIPT></HTML>");
            pw.close();
        }





    }


    private boolean existeVendedor(String correo, ArrayList<Vendedor> vend, String password) {
        boolean existe = false;
        for (int i = 0; i < vend.size(); i++) {
            if (vend.get(i).getCorreo().equals(correo) && vend.get(i).getPassword().equals(password)) {
                existe = true;
            }
        }
        return existe;
    }
}