package Servlet;

public class Bibliotecario extends Usuario 
{
  private String dependencia;

  public class Bibliotecario(String nombre, String correo, String contraseña, int id, String dependencia)
  { 
    super(nombre, correo, contraseña, id);
    this.dependencia = dependencia;
  }
}
