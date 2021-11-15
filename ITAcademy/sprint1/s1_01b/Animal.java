package s1_01b;

public class Animal {
		
	/**
	 * Exercici 5. 
	 * Crea una classe Animal amb el mètode correr sobrecarregat tres vegades. 
	 */
	
	public void correr() {
		System.out.println("Mètode còrrer 1");
	}

	public void correr(int velocitat) {
		System.out.println("Mètode còrrer 2");		
	}
	
	public boolean correr(boolean c) {
		System.out.println("Mètode còrrer 3");
		return c;
	}
}
