package servlet;

public class Oferta{
	private String correoVendedor;
	private String correoComprador;
	private String nombreOferta;
	private int precioOferta;
	private int cantidadOferta;

	




	public Oferta(String corv,String corc, String nom, int pre, int can){
		this.correoVendedor=corv;
		this.correoComprador=corc;
		this.nombreOferta=nom;
		this.precioOferta=pre;
		this.cantidadOferta=can;


	}

	public String getCorreoVendedor() {
		return correoVendedor;
	}

	public void setCorreoVendedor(String correoVendedor) {
		this.correoVendedor = correoVendedor;
	}

	public String getCorreoComprador() {
		return correoComprador;
	}

	public void setCorreoComprador(String correoComprador) {
		this.correoComprador = correoComprador;
	}

	public String getNombreOferta() {
		return nombreOferta;
	}

	public void setNombreOferta(String nombreOferta) {
		this.nombreOferta = nombreOferta;
	}

	public int getPrecioOferta() {
		return precioOferta;
	}

	public void setPrecioOferta(int precioOferta) {
		this.precioOferta = precioOferta;
	}

	public int getCantidadOferta() {
		return cantidadOferta;
	}

	public void setCantidadOferta(int cantidadOferta) {
		this.cantidadOferta = cantidadOferta;
	}
}