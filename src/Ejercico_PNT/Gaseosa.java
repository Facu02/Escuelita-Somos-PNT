package Ejercico_PNT;



public class Gaseosa extends Producto {
	
	private double litros;

	public Gaseosa(String nombre, Double litros , Double precio) {
		super(nombre, precio);
		this.litros = litros;
	}
	
	public String toString() {
		String mensaje = "Litros: "+ this.litros 
						 +" /// " + mensajePrecio();
		
		return mensaje;
		}

}
