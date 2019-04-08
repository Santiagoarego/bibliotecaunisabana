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


    public void guardaComprador(Comprador emp) {
        compradores.add(emp);
    }

    public void guardaVendedor(Vendedor pro) {
        vendedores.add(pro);
    }

    public void guardaVenta(Venta rel) {
        ventas.add(rel);

    }
    public void guardaOferta(Oferta rel) {
        ofertas.add(rel);

    }

    public ArrayList<Comprador> getCompradores() {
        return compradores;
    }

    public void setCompradores(ArrayList<Comprador> compradores) {
        this.compradores = compradores;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public ArrayList<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(ArrayList<Oferta> ofertas) {
        this.ofertas = ofertas;
    }
}