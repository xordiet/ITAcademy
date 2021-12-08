package exercici2;

import java.time.*;

public class Main {

	public static void main(String[] args) {
		GenericMethods.f("a", "b", "c");
		
		System.out.println("----------------------");
		
		//Aquí creo tres objectes Persona
		Persona p1 = new Persona("Jordi", "Borràs", 42);
		Persona p2 = new Persona("Nom", "Cognoms", 0);
		Persona p3 = new Persona();
		GenericMethods.f(p1, p2, p3);

		System.out.println("----------------------");

		//Ara creo tres objectes Time
		LocalDate t1 = LocalDate.of(1979, Month.AUGUST, 30);
		LocalDate t2 = LocalDate.of(1982, Month.APRIL, 18);
		LocalDate t3 = LocalDate.of(2017, Month.OCTOBER, 1);		
		GenericMethods.f(t1, t2, t3);

		System.out.println("----------------------");
		
		//Ara faig un mix de tipus
		GenericMethods.f("a", new Persona("Nom", "Cognoms", 0), 
				LocalDate.of(1979, Month.AUGUST, 30));

	}

}
