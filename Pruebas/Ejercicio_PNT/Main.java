package Ejercicio_PNT;

import Ejercico_PNT.Fruta;
import Ejercico_PNT.Gaseosa;
import Ejercico_PNT.Shampoo;
import Ejercico_PNT.SuperMercado;

public class Main {

	public static void main(String[] args) {
		
		SuperMercado walmart = new SuperMercado("Walmart");
		
		Gaseosa cocaColaZero = new Gaseosa("Coca-cola Zero" , 1.5 ,  20.0 );
		Gaseosa cocaCola     = new Gaseosa("Coca-cola", 1.5 , 18.0);
		Shampoo sedal		 = new Shampoo("Shampoo Sedal", 500.0, 19.0);
		Fruta   frutillas     = new Fruta("Frutillas" , 64.0, "kilo");
		
		walmart.añadirProduc(cocaColaZero);
		walmart.añadirProduc(cocaCola);
		walmart.añadirProduc(sedal);
		walmart.añadirProduc(frutillas);
		
		System.out.println(walmart);

	}

}
