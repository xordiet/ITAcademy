package nivell3_1;

public class Main {
	
	/**
	 * Exercici 1. 
	 * Demostri que un constructor d'una classe derivada 
	 * no pot capturar excepcions generades pel seu 
	 * constructor de la classe base. 
	 */

	public static void main(String[] args) {		
		try {
			System.out.println("try main");
			//Base b = new Base();
			Derivada d = new Derivada();
		} catch (Exception e) {
			System.out.println("catch main");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally main");
		}
		
	}
}
