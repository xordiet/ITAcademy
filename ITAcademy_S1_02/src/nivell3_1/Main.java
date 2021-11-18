package nivell3_1;

public class Main {
	
	/**
	 * Exercici 1. 
	 * Demostri que un constructor d'una classe derivada 
	 * no pot capturar excepcions generades pel seu 
	 * constructor de la classe basi. 
	 */

	public static void main(String[] args) {		
		try {
			//Base b = new Base("base");
			Derivada d = new Derivada("derivada");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
