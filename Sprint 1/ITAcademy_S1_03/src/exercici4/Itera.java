package exercici4;

import java.util.Collection;
import java.util.Iterator;

public class Itera {
	/**
	 * Escriu un ḿetode public static <T> void iterCollection 
	 * (Collection<T> c) que utilitzi un iterador per a recórrer 
	 * una col·lecció genèrica passada per argument i imprimeixi 
	 * tots els seus objectes (fent servir el mètode toString()).
	 */
		
	public static <T> void iterCollection (Collection<T> c) {
		
		Iterator<T> iterador = c.iterator();
		while(iterador.hasNext()) {
			System.out.print(iterador.next().toString());
			if(iterador.hasNext()) {
				System.out.print(", ");
			}
			
		}
	}	

}
