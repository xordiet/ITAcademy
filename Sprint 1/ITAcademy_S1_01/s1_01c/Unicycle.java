package s1_01c;

public class Unicycle extends Cycle{
	public Unicycle() {
		super.setRodes(1);
	}
	
	/**
	 * Exercici 3. 
	 * Afegeixi un mètode 'balance()' a Unicycle i a Bicycle amb una 
	 * implementació diferent a cada un, però no a Tricycle. 
	 * @return 
	 */
	public void balance() {
		System.out.println("Unicycle balance");
	}

}
