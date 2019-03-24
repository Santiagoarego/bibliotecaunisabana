package servlet;

public class Empleado{
	private String documento;
	private String nombre;
	private String apellido;
	private String cargo;
	private String habilidades;


	public Empleado(){
		this.documento="";
		this.nombre="";
		this.apellido="";
		this.cargo="";
		this.habilidades="";
	}

	public Empleado(String doc, String nom, String ape, String car, String resp){
		this.documento=doc;
		this.nombre=nom;
		this.apellido=ape;
		this.cargo=car;
		this.habilidades=resp;

	}

	public String getDocumento(){
		return this.documento;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getApellido(){
		return this.apellido;
	}

	public String getCargo(){
		return this.cargo;
	}

	public String getHabilidades(){
		return this.habilidades;
	}






}