package s1_01c;

public class Cycle {
	
	private int rodes=0;
	/**
	 * Exercici 1. 
	 * Creu una classe Cycle, amb les seves subclasses: Unicycle, Bicycle 
	 * i Tricycle. Demostri que es pot generalitzar una instància de cada 
	 * tipus a Cycle mitjançant el mètode: public static void ride(Cycle c).
	 */
	public static void ride(Cycle c) {
		System.out.println("riding la cycle");
		c.wheels();
	}
	/**
	 * Exercici 2. 
	 * Afegeixi un mètode 'wheels()' a Cycle, que retorni el nombre de rodes. 
	 * Modifiqui 'ride()' per a invocar 'wheels()' i verifiqui que funciona 
	 * el polimorfisme. 
	 */
	public void wheels() {
		System.out.println("Aquest cicle té " + this.rodes + "rodes");
	}
	
	public int getRodes() {
		return rodes;
	}
	public void setRodes(int rodes) {
		this.rodes = rodes;
	}
	

}
