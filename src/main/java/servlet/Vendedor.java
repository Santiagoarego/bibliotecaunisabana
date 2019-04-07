package servlet;

public class Vendedor {
    private String correo;
    private String password;


    public Vendedor(String correo, String password) {
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