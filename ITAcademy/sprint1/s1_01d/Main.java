package s1_01d;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Exercici 4.
		 * Crea un array d'objectes Rossegador, emplena'l amb diferents 
		 * tipus específics de rossegadors i invoqui els mètodes de la classe 
		 * base demostrant què succeeix.
		 */
		
		Rossegador[] r = new Rossegador[6];
		r[0] = new Ratoli();
		r[1] = new Ratoli();
		r[2] = new Jerbu();
		r[3] = new Jerbu();
		r[4] = new Hamster();
		r[5] = new Hamster();
		
		r[0].correr();
		r[2].ensumar();
		r[4].rosegar();

	}

}
