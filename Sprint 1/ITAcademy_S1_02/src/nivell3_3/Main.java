package nivell3_3;

public class Main {
	
	/**
	 * Exercici 3. 
	 * Afegeixi una classe amb un mètode 'dispose()' a l'exercici anterior. 
	 * 
	 * Modifiqui 'FailingConstructor' perquè el constructor creï un d'aquests 
	 * objectes eliminables com un objecte membre, després de la qual cosa el 
	 * constructor pot generar una excepció i crear un segon objecte membre 
	 * eliminable. 
	 * 
	 * Escrigui el codi necessari per a protegir-se adequadament contra les 
	 * fallades i verifiqui en 'main()' que estan cobertes totes les possibles 
	 * situacions de fallada.
	 */

	public static void main(String[] args) {
		FailingConstructor f = new FailingConstructor();
	}

}
