package servlet;

public class Relacion{
	private String codigo;
	private String documento;
	private int horas;
	private int dias;
	private String responsabilidades;

	


	public Relacion(){
		this.codigo="";
		this.documento="";
		this.horas=0;
		this.dias =0;
		this.responsabilidades="";
		
		
	}

	public Relacion(String cod, String doc, int hor,int di,String resp){
		this.codigo=cod;
		this.documento=doc;
		this.horas=hor;
		this.dias =di;
		this.responsabilidades=resp;

	}

	public String getCodigo(){
		return this.codigo;
	}

	public String getDocumento(){
		return this.documento;
	}

	





}