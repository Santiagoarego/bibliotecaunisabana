package servlet;

public class Venta{
	private String correoVendedor;
	private String nombre;
	private String lugar;
	private String nombreVendedor;
	private String descripcion;
	private int cantidad;
	private String fecha;
	private int precioBase;

	




	public Venta(String cor, String nom, String place, String SellerName, String des, int can,String date, int base){
		this.correoVendedor=cor;
		this.nombre=nom;
		this.lugar=place;
		this.nombreVendedor=SellerName;
		this.descripcion=des;
		this.cantidad=can;
		this.fecha=date;
		this.precioBase=base;

	}

	public String getCorreoVendedor() {
		return correoVendedor;
	}

	public void setCorreoVendedor(String correoVendedor) {
		this.correoVendedor = correoVendedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
}