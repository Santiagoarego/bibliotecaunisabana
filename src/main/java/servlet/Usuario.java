package servlet;

public class Comprador {
    private String correo;
    private String password;
    private String nombresape;
    private String adjudicado;
    private String tipo;
    private int carnet;


    public Comprador(String correo, String password) {
        this.correo = correo;
        this.password = password;

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}