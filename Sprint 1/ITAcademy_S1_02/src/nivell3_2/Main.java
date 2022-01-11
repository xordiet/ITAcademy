package nivell3_2;

public class Main {
	
	/**
	 * Exercici 2. 
	 * Creu una classe denominada 'FailingConstructor' amb un constructor 
	 * que falli a la meitat del procés de construcció i generi una excepció. 
	 * En 'main()', escrigui el codi que permeti protegir-se apropiadament 
	 * enfront d'aquesta fallada.
	 */

	public static void main(String[] args) {
		FailingConstructor f = new FailingConstructor();
	}

}
