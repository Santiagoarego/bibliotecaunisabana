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
public class Arreglos{

    private static Arreglos instancia = null;
    private ArrayList<Empleado> empleados = new ArrayList();
    private ArrayList<Proyecto> proyectos = new ArrayList();
    private ArrayList<Relacion> relaciones = new ArrayList();

    public static Arreglos constructora(){

        if(instancia==null){
          instancia=new Arreglos();
        }

        return instancia;
    }


    public void guardaEmpleado(Empleado emp){
        empleados.add(emp);
    }

    public void guardaProyecto(Proyecto pro){
        proyectos.add(pro);
    }
    public void guardaRelacion(Relacion rel){
        relaciones.add(rel);

    }
    public ArrayList<Empleado> getEmpleados(){

        return this.empleados;
    }
    public ArrayList<Proyecto> getProyectos(){

        return this.proyectos;
    }

}
    

