package nivell3_2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	/**
	 * Repeteixi l'exercici anterior per a un contenidor de tipus int 
	 * (per exemple anomenat 'Numeros' i amb un mètode 'add') i compari 
	 * el rendiment amb el d'un ArrayList<Integer>. 
	 * En la comparació de rendiment, inclogui el procés d'incrementar 
	 * cada objecte al contenidor.
	 */

	public static void main(String[] args) {
		long tInici = System.nanoTime();
		Numeros c = new Numeros();
		for(int i=0; i<1000; i++) {
			int num = obteRandom(0,100);
			c.add(num);
		}		
		long tFinal = System.nanoTime();
		long durada = (tFinal - tInici);
		System.out.println(c.toString());
		System.out.println("durada: "+durada);
		
		tInici = System.nanoTime();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<1000; i++) {
			int num = obteRandom(0,100);
			a.add(num);
		}
		tFinal = System.nanoTime();
		durada = (tFinal - tInici);
		System.out.println(a.toString());
		System.out.println("durada: "+durada);
	}
	
	private static int obteRandom(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
