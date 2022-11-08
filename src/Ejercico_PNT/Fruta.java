package Ejercico_PNT;



public class Fruta extends Producto {
	
	private String unidadDeVenta;

	public Fruta(String nombre, Double precio, String unidadDeVenta) {
		super(nombre, precio);
		this.unidadDeVenta = unidadDeVenta;
	}
	
	public String toString() {
		String mensaje  =  mensajePrecio() + " /// " + "Unidad de venta: " + this.unidadDeVenta;
		return mensaje;
		}

	

}
