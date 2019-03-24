package servlet;

public class Proyecto{
	private String codigo;
	private String nombre;
	private int duracion;
	private String plataformas;
	


	public Proyecto(){
		this.codigo="";
		this.nombre="";
		this.duracion=0;
		this.plataformas="";
		
	}

	public Proyecto(String cod, String nom, int duracion, String plata){
		this.codigo=cod;
		this.nombre=nom;
		this.duracion=duracion;
		this.plataformas=plata;

	}

	public String getCodigo(){
		return this.codigo;
	}

	public String getNombre(){
		return this.nombre;
	}

	public int getDuracion(){
		return this.duracion;
	}

	public String getPlataformas(){
		return this.plataformas;
	}

	






}