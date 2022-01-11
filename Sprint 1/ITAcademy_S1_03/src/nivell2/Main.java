package nivell2;

import java.util.PriorityQueue;

public class Main {
	
	/** 
	 * Empleni una cua de tipus PriorityQueue amb objectes d'aquesta classe i 
	 * extregui els valors utilitzant poll() per a demostrar que s'obté l'ordre desitjat.
	 */

	public static void main(String[] args) {
		
		int qt = 10;
		
		PriorityQueue<Numero> q=new PriorityQueue<Numero>();		
		for (int i=0; i<qt; i++) {
			q.add(new Numero());
		}
		
		for (int i=0; i<qt; i++) {
			System.out.print("Primer núm: " + q.peek());
			System.out.print(" | Elimina... " + q.poll());
			System.out.println(" | Nou primer núm: " + q.peek());
		}

	}

}
