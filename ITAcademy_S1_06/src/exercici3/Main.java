package exercici3;

import java.time.*;

public class Main {

	public static void main(String[] args) {
		GenericMethods.f("a", "b", "c");
		
		System.out.println("----------------------");
		
		//Aquí creo tres objectes Persona
		Persona p1 = new Persona("Jordi", "Borràs", 42);
		Persona p2 = new Persona("Nom", "Cognoms", 0);
		GenericMethods.f(p1, p2, "Hola Món!");

		System.out.println("----------------------");

		//Ara creo tres objectes Time
		LocalDate t1 = LocalDate.of(1979, Month.AUGUST, 30);
		LocalDate t2 = LocalDate.of(1982, Month.APRIL, 18);
		GenericMethods.f(t1, t2, "Els cavallers que diuen ni");

		System.out.println("----------------------");
		
		//Ara faig un mix de tipus
		GenericMethods.f("a", new Persona("Nom", "Cognoms", 0), 
				"spam spam spam");

	}

}
