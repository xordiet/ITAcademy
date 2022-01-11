package s1_01;

public class Main {

	public static void main(String[] args) {
		/**
		 * Exercici 1. Execució.
		 */
		Vehicle v1 = new Vehicle();
		System.out.println(v1);
		v1.Iniciar();
		
		/**
		 * Exercici 2. Execució.
		 */
		Vehicle v2 = new Vehicle();
		v2.accelerar();
		Vehicle.parar();
		
		/**
		 * Exercici 3. Demostri que el procés de càrrega d'una classe 
		 * només té lloc una vegada. Demostri que la càrrega pot ser 
		 * provocada per la creació de la primera instància d'aquesta 
		 * classe o per l'accés a un membre estàtic d'aquesta. 
		 */
		System.out.println("Vehicle 1:" + v1);
		System.out.println("Vehicle 2:" + v2);
		
		/**
		 * Exercici 4. Execució
		 */
		v1.motor = 1600;
		v2.motor = 2000;
		/*
		 * al ser static la variable motor és comuna en ambdós instàncies, 
		 * per tant al declarar v2 com a 2000 també es modifica v1 i passa 
		 * a ser 2000 en comptes de 1600.
		 */
		System.out.println(v1.motor);
		/*
		 * Al ser declarades final no pots canviar el valor i dona error.
		 * comento per fer el programa funcional i evitar l'error
		 */
		//v1.numPortes=5;
		//v1.mobilitat = false;
		
		
	}

}
