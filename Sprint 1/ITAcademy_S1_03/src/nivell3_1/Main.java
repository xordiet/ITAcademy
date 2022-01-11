package nivell3_1;

import java.util.ArrayList;

public class Main {
	
	/*
	 * En main(), compari el rendiment d'aquest contenidor amb el d'un ArrayList<String>.
	 */

	public static void main(String[] args) {
		long tInici = System.nanoTime();
		Contenidora c = new Contenidora();
		c.add("hola món");
		c.add("això és");
		c.add("una prova");
		c.add("per");
		c.add("mesurar");
		c.add("el rendiment");
		c.add("d'un contenidor");
		c.add("amb un array");
		c.add("d'Strings");
		c.add("front");
		c.add("un ArrayList<String>");
		long tFinal = System.nanoTime();
		long durada = (tFinal - tInici);
		System.out.println(c.toString());
		System.out.println("durada: "+durada);
		
		tInici = System.nanoTime();
		ArrayList<String> a = new ArrayList<String>();
		a.add("hola món");
		a.add("això és");
		a.add("una prova");
		a.add("per");
		a.add("mesurar");
		a.add("el rendiment");
		a.add("d'un contenidor");
		a.add("amb un array");
		a.add("d'Strings");
		a.add("front");
		a.add("un ArrayList<String>");
		tFinal = System.nanoTime();
		durada = (tFinal - tInici);
		System.out.println(a.toString());
		System.out.println("durada: "+durada);

	}

}
