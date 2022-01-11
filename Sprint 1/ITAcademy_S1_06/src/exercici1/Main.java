package exercici1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Constructor buit i mètode guardaPersones();
		//el qual defineix les persones en la classe.
		NoGenericMethods ng = new NoGenericMethods();
		ng.guardaPersones();
		System.out.println(ng.toString());
		
		//Aquí creo tres objectes Persona
		Persona p1 = new Persona("Jordi", "Borràs", 42);
		Persona p2 = new Persona("Nom", "Cognoms", 0);
		Persona p3 = new Persona();
		
		//Constructor 1 amb ordre 1,2,3
		NoGenericMethods ng1 = new NoGenericMethods(p1,p2,p3);
		System.out.println(ng1.toString());

		//Constructor 2 amb ordre 3,1,2
		NoGenericMethods ng2 = new NoGenericMethods(p3,p1,p2);
		System.out.println(ng2.toString());
		
		//Constructor buit i afegeixo persones ordre 3,2,1 amb mètode afegeixPersona()
		NoGenericMethods ng3 = new NoGenericMethods();
		ng3.afegeixPersona(p3);
		ng3.afegeixPersona(p2);
		ng3.afegeixPersona(p1);
		System.out.println(ng3.toString());
		
		//Aquí recuperem les persones del constructor 1 a una ArrayList
		System.out.println();
		ArrayList<Persona> ps = ng1.extreuPersones();
		System.out.println(ps);
		
	}

}
