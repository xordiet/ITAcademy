package s1_01d;

public class Jerbu extends Rossegador {
	/**
	 * Exercici 4.
	 * substitueixi aquests mètodes a les classes derivades per a obtenir 
	 * diferents comportaments depenent del tipus específic de rossegador
	 */
	@Override
	public void ensumar() {
		super.ensumar();
		System.out.println("El Jerbu ensuma");
	}

	@Override
	public void rosegar() {
		super.rosegar();
		System.out.println("El Jerbu rosega");
	}

	@Override
	public void correr() {
		super.correr();
		System.out.println("El Jerbu corre");
	}
}
