package org.itacademy.javatesting.assertj;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MainClassTest {
	/**
	 * Exercici 1. 
	 * Una asserció que demostri que el valor de dos objectes 
	 * sencers és igual, i una altra que indiqui que no ho és.
	 */
	@Test
	public void exercici1() {
		Objecte o1 = new Objecte(2);
		Objecte o2 = new Objecte(2);
		Objecte o3 = new Objecte(3);
		assertThat(o1.getNumero())
				.as("exercici 1 a")
				.isEqualTo(o2.getNumero());
		assertThat(o1.getNumero())
				.as("exercici 1 b")
				.isNotEqualTo(o3.getNumero());
	}
	
	/**
	 * Exercici 2. 
	 * Una asserció que demostri que la referència a un objecte és la 
	 * mateixa que una altra, i una altra que indiqui que és diferent.
	 */
	@Test
	public void exercici2() {
		Objecte o1 = new Objecte(2);
		Objecte o2 = new Objecte(2);
		assertThat(o1)
			.as("exercici 2 a")
			.isEqualTo(o1);
		assertThat(o1)
			.as("exercici 2 b")
			.isNotEqualTo(o2);
	}
	
	/**
	 * Exercici 3.
	 * Una asserció que indiqui que dues arrays d'enters són idèntics.
	 */
	@Test
	public void exercici3() {
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		assertThat(arr1)
			.as("Exercici 3")
			.isEqualTo(arr2);
	}
	
	/**
	 * Exercici 4.
	 * Creu un array list contenidor de diversos tipus d'objectes (creu-los també).
	 */
	@Test
	public void exercici4a() {
		List<Integer> llista1= new ArrayList<Integer>();
		llista1.add(3);
		llista1.add(2);
		llista1.add(1);
		/**
		 * Escrigui una asserció per a verificar l'ordre dels objectes en 
		 * l'ArrayList segons van ser inserits.
		 */
		List<Integer> llista2= new ArrayList<Integer>();
		llista2.add(3);
		llista2.add(2);
		llista2.add(1);
		assertThat(llista1.toArray())
			.as("Exercici 4 a ")
			.containsExactlyElementsOf(llista2);
		
	}
	
	@Test
	public void exercici4b() {
		List<Integer> llista1= new ArrayList<Integer>();
		llista1.add(3);
		llista1.add(2);
		llista1.add(1);
		/**
		 * Ara verifiqui que la llista anterior conté els objectes en qualsevol ordre.
		 */
		List<Integer> llista3= new ArrayList<Integer>();
		llista3.add(1);
		llista3.add(3);
		llista3.add(2);
		assertThat(llista1.toArray())
		.as("Exercici 4 b ")
		.containsExactlyInAnyOrder(llista3.toArray());
		/**
		 * Verifiqui que, en la llista anterior, un dels objectes s'ha afegit 
		 * només una vegada. Deixi un dels elements sense afegir, i verifiqui 
		 * no la llista no conté aquest últim.
		 */
		assertThat(llista3.toArray())
		.as("Exercici 4 c ")
		.containsOnlyOnce(1);
		
	}
	
	@Test
	public void exercici4c() {
		List<Integer> llista1= new ArrayList<Integer>();
		llista1.add(0);
		llista1.add(1);
		llista1.add(2);
		llista1.add(3);
		/**
		 * Verifiqui que, en la llista anterior, un dels objectes s'ha afegit 
		 * només una vegada.
		 */
		assertThat(llista1.toArray())
		.as("Exercici 4 c ")
		.containsOnlyOnce(1);
		
	}
	
	@Test
	public void exercici4d() {
		List<Integer> llista1= new ArrayList<Integer>();
		llista1.add(0);
		llista1.add(2);
		llista1.add(3);
		/**
		 * Deixi un dels elements sense afegir, i verifiqui no la llista 
		 * no conté aquest últim.
		 */
		assertThat(llista1.toArray())
		.as("Exercici 4 d ")
		.doesNotContain(1,8);
		
	}
	
	@Test
	public void exercici5() {
		/**
		 * Exercici 5. 
		 * Creu un map i verifiqui que conté una de les key que li afegeixi.
		 */
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Lorem");
		hm.put(1, "ipsum");
		hm.put(2, "dolor");
		hm.put(3, "sit");
		hm.put(4, "amet");
		assertThat(hm)
			.as("Exercici 5")
			.containsKey(2)
			.containsEntry(1, "ipsum");
		
	}
}
