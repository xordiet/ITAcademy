package exercici6;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	/**
	 * Crea un objecte buit LinkedList<Integer>. 
	 * Utilitzant un iterador ListIterator, 
	 * afegeixi valors sencers a la llista inserint-los 
	 * sempre a la meitat d'aquesta.
	 */
	
	public static LinkedList<Integer> llista = new LinkedList<Integer>();

	public static void main(String[] args) {
		afegirMig(llista, 1);
		afegirMig(llista, 2);
		afegirMig(llista, 3);
		afegirMig(llista, 4);
		afegirMig(llista, 5);
		afegirMig(llista, 6);
		afegirMig(llista, 7);
		afegirMig(llista, 8);
		afegirMig(llista, 9);
		afegirMig(llista, 10);
		
	}
	
	public static void afegirMig(LinkedList<Integer> list, Integer val) {
		if (llista.size()<2){
			// com l'hem iniciada buida el iterador no s'inicia, per tant el primers 
			// valors s'han d'afegir "manualment"
			list.add(0, val);
			System.out.println(llista);
		} else {
			ListIterator<Integer> it = list.listIterator(list.size()/2);
			it.add(val);	        	
		    System.out.println(llista);
		}
	    
	}

}
