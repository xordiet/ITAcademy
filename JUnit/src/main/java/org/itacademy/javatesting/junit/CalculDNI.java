package org.itacademy.javatesting.junit;

/**
 * Creu una classe Java 'CalculoDni' 
 * que calculi la lletra del DNI en rebre el número com a paràmetre.
 *
 */

public class CalculDNI {
	private String lletra;
	
	public CalculDNI (int numero) {
		String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo= numero % 23;
		this.lletra = juegoCaracteres.charAt(modulo)+"";	
	}
	
	public String obteLletra() {
		return lletra;
	}
}
