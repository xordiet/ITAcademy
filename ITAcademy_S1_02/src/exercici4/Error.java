package exercici4;

public class Error {
	
	/**
	 * Exercici 4. 
	 * Creu la seva pròpia classe de Exception utilitzant la paraula clau 'extends'. 
	 * Escrigui un constructor per a aquesta classe que prengui un argument String 
	 * i l'emmagatzemi dins de l'objecte com una referència de tipus String. 
	 * Escrigui un mètode que mostri la cadena de caràcters emmagatzemada. 
	 * Creu una clàusula try-*catch per a provar la nova excepció.
	 */

	public static void main(String[] args) {
		try {
        	AccioRandom();
        } catch (ErrorPropi e) {
        	System.out.println(e.mostraError());
        }
	}
	
	static void AccioRandom() throws ErrorPropi {
		throw new ErrorPropi("Això és un error propi llançat expressament!");		
	}

}

class ErrorPropi extends Exception{
	
	private String error;
	
	public ErrorPropi(String error) {
		this.error = error;		
	}
	
	String mostraError() {
		return error;
	}
}