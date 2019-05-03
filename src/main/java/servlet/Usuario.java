package servlet;


public class Usuario {
    private String nombre;
    private String id;
	private String correo;
	private String contraseña;


    public Usuario(String nombre, String correo, String contraseña, String id) 
	{
        this.correo = correo;
        this.contraseña = contraseña;
		this.nombre = nombre;
		this.id = id;
	}

    public String getCorreo() 
	{
        return this.correo;
    }

    public void setCorreo(String correo) 
	{
        this.correo = correo;
    }

    public String getContraseña() 
	{

        return this.contraseña;
    }

    public void setContraseña(String password) 
	{
        this.contraseña = password;
    }
	
	public void setNombre(String nombre) 
	{
        this.nombre = nombre;
    }
	
	public String getNombre() 
	{
        return this.contraseña;
    }
	
	public String getId() 
	{
        return this.id;
    }
	
	public void setId(String id)
	{
		this.id=id;
	}
	
}