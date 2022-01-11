package s1_01b;

public class Main {

	/**
	 * Exercici 5. 
	 * Mostri que els quatre mètodes estan disponibles en la classe derivada 
	 * (per exemple, enviant un missatge a la consola).
	 */
	public static void main(String[] args) {		
		Gat g1 = new Gat();
		g1.correr();
		g1.correr(25);
		g1.correr(true);
		g1.correr(1);
		
		/**
		 * Exercici 6.
		 * Al 'main()' crea un objecte Frog i realitza una generalització a Amphibian,
		 * demostrant que tots els mètodes continuen funcionant
		 */
		Amphibian a = new Frog();
		a.moure();
		a.respirar();
		a.menjar();
		
		/**
		 * Exercici 7.
		 * crida’l des del main, desprès de fer la generalització a Amphibian. 
		 * Demostra que la crida a aquest mètode saltar dona error.
		 */
		//Si descomento la instrucció següent dona error
		//a.saltar();
		
		/**
		 * Exercici 8.
		 * Demostri que ocorre al mètode 'main()' si manté la generalització o no
		 */
		/*
		 * a l'haver sobreescrit els mètodes les crides de l'objecte "a"
		 * usa les de la classe Frog malgrat ser un Amphibian ja que està generalitzat
		 * en canvi l'"a2" que no ho està, usa les de la classe pare.
		 */
		Amphibian a2 = new Amphibian();
		a2.moure();
		a2.respirar();
		a2.menjar();
		
	}
	

	
}
