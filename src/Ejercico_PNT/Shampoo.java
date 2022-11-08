package Ejercico_PNT;



public class Shampoo extends Producto{
	
	private Double contenido;

	public Shampoo(String nombre, Double contenido, Double precio) {
		super(nombre, precio);
		this.contenido = contenido;
		
	}
	
	public String toString() {
		
		String mensaje = "Contenido: "+ redondearDecimales(this.contenido)  + "ml" 
						 + " /// " + mensajePrecio();
		
		return mensaje;
		}

	

}
