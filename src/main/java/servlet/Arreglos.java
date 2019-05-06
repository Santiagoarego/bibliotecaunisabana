package servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "MyServlet",
        urlPatterns = {"/arreglos"}
    )
public class Arreglos {

    private static Arreglos instancia = null;
    private ArrayList<Comprador> compradores = new ArrayList();
    private ArrayList<Vendedor> vendedores = new ArrayList();
    private ArrayList<Venta> ventas = new ArrayList();
    private ArrayList<Oferta> ofertas = new ArrayList();
    public static Arreglos constructora() {

        if (instancia == null) {
            instancia = new Arreglos();
        }

        return instancia;
    }


    public void guardaEstudiante(Estudiante est) {
        estudiantes.add(est);
    }

    public void guardaBibliotecario(Bibliotecario bib) {
        bibliotecarios.add(bib);
    }

    public ArrayList<Comprador> getBibliotecarios() {
        return this.bibliotecarios;
    }

    public void setBibliotecarios(ArrayList<Bibliotecario> bibliotecarios1) {
        this.bibliotecarios = bibliotecarios1;
    }
}
