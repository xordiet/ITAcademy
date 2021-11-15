package s1_01;

public class Vehicle {
	
	/**
	 * Exercici 4.
	 * A la classe Vehicle afegeix un camp static final, un camp final i 
	 * un camp static. Demostri la diferència entre els tres. 
	 * Quins es poden inicialitzar al constructor de la classe?
	 */
	static final boolean mobilitat = true; //s'ha d'inicialitzar al declarar-lo
	final int numPortes; //no podrà ser modificada un cop assignada
	static int motor;
	
	
	/**
	 * Exercici 1. 
	 * Crea una classe Vehicle amb 2 mètodes: un constructor i un mètode anomenat 
	 * 'Iniciar', que es invocat pel 'main()' (aquest mètode pot estar en la mateixa 
	 * classe o en una classe apart) . Demostri la seqüència d'execució dels mètodes 
	 * de la classe (per exemple, enviant un missatge a la consola).
	 */
	public Vehicle() {
		this.numPortes = 4; //assignem la variable de l'ex. 4
	}
	
	void Iniciar() {
		System.out.println("Aquest vehicle s'ha iniciat! :)");
	}
	
	/**
	 * Exercici 2. 
	 * A la classe Vehicle afegeix dos mètodes: un static anomenat parar 
	 * i un altre no-static anomenat accelerar. Demostri com invocar el 
	 * mètode static i el no-static des del main (per exemple, enviant un 
	 * missatge a la consola).
	 */
	static void parar() {
		System.out.println("El vehicle s'ha parat! :(");
	}
	void accelerar() {
		System.out.println("Accelerant... Gaaaas!");
	}	

}
