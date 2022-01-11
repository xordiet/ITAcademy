package exercici5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		/**
		 * Crea i empleni un objecte List<Integer>. 
		 * Crea i empleni un segon objecte List<Integer> de la mateixa 
		 * grandària que el primer. 
		 * Utilitzi sengles objectes ListIterator per a llegir els elements 
		 * de la primera llista i inserir-los en la segona en ordre invers 
		 * (provi d'explorar diverses formes diferents de resoldre aquest problema).
		 */
		
		List<Integer> ll1 = Arrays.asList(0,1,2,3,4);
		System.out.println(ll1);
		
		List<Integer> ll2 = Arrays.asList(5,6,7,8,9);
		System.out.println(ll2);

		
		/*
		 * Mètode 1: amb iterador en una llista nova
		 */
		//creo una llista buida per no alterar les existents
		List<Integer> metode1 = new ArrayList<Integer>();
		//afegeixo els items de la segona llista en l'ordre normal
		for (ListIterator<Integer> it = ll2.listIterator(); it.hasNext(); ) {
		    Integer t = it.next();
		    metode1.add(t);
		}
		//afegeixo els items de la primera llista en l'ordre invers		
		for (ListIterator<Integer> it = ll1.listIterator(ll1.size()); it.hasPrevious(); ) {
		    Integer t = it.previous();
		    metode1.add(t);
		}
		//imprimeixo els resultats
		System.out.println("Mètode 1: "+metode1);

		/*
		 * Mètode 2: torno a fer-ho amb iterador 
		 * però en comptes de crear una llista buida treballo 
		 * amb una llista existent (duplciat de la segona)
		 * més compacte i m'estalvio iterar la segona llista
		 */
		//copio la llista segona per no alterar la original
		List<Integer> metode2 = new ArrayList<Integer>(ll2);
		//afegeixo els items de la primera llista en l'ordre invers		
		for (ListIterator<Integer> it = ll1.listIterator(ll1.size()); it.hasPrevious(); ) {
		    Integer t = it.previous();
		    metode2.add(t);
		}
		//imprimeixo els resultats
		System.out.println("Mètode 2: "+metode2);

		/*
		 * Mètode 3: amb Stream
		 */
		List<Integer> metode3 = Stream.concat(ll2.stream(), 
				ll1.stream().sorted(Collections.reverseOrder())).collect(Collectors.toList());
		//imprimeixo els resultats
		System.out.println("Mètode 3: "+metode3);
		
		/*
		 * Mètode 4: amb for-each
		 * Maca fer que el ll1 estigui invertit l'ordre
		 */
		List<Integer> metode4 = new ArrayList<Integer>(ll2);
		//for (Integer o : ll1)
		for(int o=ll1.size()-1; o >=0; o--)
			metode4.add(ll1.get(o));
		//imprimeixo els resultats
		System.out.println("Mètode 4: "+metode4);	
	}

}
