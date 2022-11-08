package Ejercico_PNT;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;



public class SuperMercado {
	
	private ArrayList<Producto> productos 			= new ArrayList<Producto>();
	
	private LinkedList<Producto> productosOrdenados 		= new LinkedList<Producto>();
	
	private Producto objetoMasCaro;
	private Producto objetoMasBarato;
	

	
	private String nombre;
	
	public SuperMercado( String nombre ) {
		this.nombre = nombre;
	}

	public boolean añadirProduc(Producto producto) {
		
		return productos.add(producto);
	}
	
	
	public String toString() {
		
		String mensaje = "";
		
		OrdenarProducMayorAMenor();
		
		ObtenerProductMayorYMenor();
		
		for(Producto producto : productos) {
			mensaje += "Nombre: " + producto.getNombre() + " /// " +  producto + "\n";
		}
		 
		mensaje += "=============================\n" ;
		
		mensaje += "Producto más caro: "+ objetoMasCaro.getNombre() + "\n";
		
		mensaje += "Producto más barato: "+ objetoMasBarato.getNombre();
		

		return mensaje;
		
	}

	
	
	public void OrdenarProducMayorAMenor() {
		
		productosOrdenados.addAll(this.productos) ;
		
		Collections.sort(productosOrdenados);
		
	}

	private void ObtenerProductMayorYMenor() {
	
				
		objetoMasCaro   	= productosOrdenados.getFirst();
		objetoMasBarato 	= productosOrdenados.getLast();
	}

	
	
}
