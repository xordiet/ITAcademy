package exercici3;

import java.util.ArrayList;

public class Generadora {
	
	/**
	 * Crea una classe anomenada Generadora que retorni noms de personatges 
	 * (com String) de la seva pel·lícula favorita cada que vegada que 
	 * invoqui al mètode 'seguentPersonatge()', i que torni al principi de la 
	 * llista de personatges una vegada que hagi acabat amb tots els noms.
	 */

	private int posicio = 0;
	String[] pr = new String[] {"Rei Artús", "Patsy", "Sir Lancelot", "Sir Robin", 
			"Sir Bedevere", "Sir Galahad", "Caballer que diu Ni", "Caballer negre", "bruixa"};
	
	
	public String seguentPersonatge() {
		String personatge = pr[posicio];
		if (posicio==pr.length-1) {
			posicio=0;
		} else {
			posicio++;
		}
		return personatge;
	}
	
	public int llargada() {
		return pr.length;
	}
	public void resetPosicio() {
		posicio = 0;
	}
	
}
