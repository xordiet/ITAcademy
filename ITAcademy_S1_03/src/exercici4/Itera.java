package exercici4;

import java.util.Collection;

public class Itera {
	/**
	 * Escriu un ḿetode public static <T> void iterCollection 
	 * (Collection<T> c) que utilitzi un iterador per a recórrer 
	 * una col·lecció genèrica passada per argument i imprimeixi 
	 * tots els seus objectes (fent servir el mètode toString()).
	 */
	public static <T> void iterCollection (Collection<T> c) {
		for (T t : c) {
			System.out.print(t.toString());
			System.out.print(", ");
		}
	}

}
