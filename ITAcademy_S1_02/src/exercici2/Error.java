package exercici2;

public class Error {
	public static void main(String[] args) {
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