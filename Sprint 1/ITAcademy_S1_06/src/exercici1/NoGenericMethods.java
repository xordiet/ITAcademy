package exercici1;

import java.util.ArrayList;

public class NoGenericMethods {
	private ArrayList<Persona> persones;
	
	public NoGenericMethods() {
		persones = new ArrayList<Persona>();
	}
	public NoGenericMethods(Persona p1, Persona p2, Persona p3) {
		persones = new ArrayList<Persona>();
		persones.add(p1);
		persones.add(p2);
		persones.add(p3);
	}
	
	public void guardaPersones() {
		persones.add(new Persona("Jordi","Borràs",42));
		persones.add(new Persona());
		persones.add(new Persona("Nom","Cognoms",0));
	}
	
	public void afegeixPersona(Persona p) {
		persones.add(p);
	}
	
	public ArrayList<Persona> extreuPersones(){
		return persones;
	}

	@Override
	public String toString() {
		return "NoGenericMethods \n '-> " +persones.size()+ " persones: " + persones + "";
	}
	

}
