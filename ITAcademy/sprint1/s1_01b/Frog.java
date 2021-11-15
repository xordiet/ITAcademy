package s1_01b;

public class Frog extends Amphibian{

	/**
	 * Exercici 6.
	 * Defineix una nova classe denominada Frog que hereti de l'anterior.
	 */
	/**
	 * Exercici 7. A l'exercici anterior crea un nou mètode saltar a la classe Frog
	 */
	public void saltar() {
		System.out.println("Saltar");
	}

	/*
	 * Exercici 8. 
	 * Modifiqui l'exercici anterior perquè l'objecte Frog substitueixi 
	 * les definicions de mètodes de la classe base.
	 */
	@Override
	public void moure() {
		System.out.println("moure a Frog");
	}

	@Override
	public void respirar() {
		System.out.println("respirar a Frog");
	}

	@Override
	public void menjar() {
		System.out.println("menjar a Frog");
	}

}
