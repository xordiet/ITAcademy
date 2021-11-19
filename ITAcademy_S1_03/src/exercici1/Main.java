package exercici1;

import java.util.ArrayList;

public class Main {
	
	/**
	 * Exercici 1. 
	 * Crea una classe anomenada Month amb un atribut "name" 
	 * (que emmagatzemarà el nom del mes de l'any). 
	 * 
	 * Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) 
	 * en un Contenidor ArrayList Java, a excepció de l'objecte amb atribut "Agost". 
	 * Després, efectuï la inserció en el lloc que correspon a aquest mes i demostri 
	 * que el Contenidor manté l'ordre correcte.
	 */

	public static void main(String[] args) {
		ArrayList<Month> mesos = new ArrayList<Month>();
		mesos.add(new Month("Gener"));
		mesos.add(new Month("Febrer"));
		mesos.add(new Month("Març"));
		mesos.add(new Month("Abril"));
		mesos.add(new Month("Maig"));
		mesos.add(new Month("Juny"));
		mesos.add(new Month("Juliol"));
		//aquí aniria agost
		mesos.add(new Month("Setembre"));
		mesos.add(new Month("Octubre"));
		mesos.add(new Month("Novembre"));
		mesos.add(new Month("Desembre"));
		
		for (Month i : mesos) {
			System.out.println(i.getName());
		}
		
		System.out.println();
		System.out.println("nova inserció de l'agost");
		System.out.println();

		mesos.add(7, new Month("Agost"));
		
		for (Month i : mesos) {
			System.out.println(i.getName());
		}
	}

}
