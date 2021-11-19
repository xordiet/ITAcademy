package exercici2;

public class Error {
	
	/**
	 * Exercici 2.
	 */
	
	public static void main(String[] args) {
		/*
		 * Defineixi una referència a un objecte i inicialitzi-la amb null.
		 */
		Objecte obj = null;
		/*
		 * Tracti d'invocar un mètode a través d'aquesta referència.
		 */
		//obj.metode1();
		
		/*
		 * Ara envolti el codi amb una clàusula try-*catch per a capturar l'excepció.
		 */
		try {
			obj.metode1();
		} catch (NullPointerException e) {
			System.out.println("Error en la crida:");
			System.out.println(e.getMessage());
		}
	}

}