package exercici8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		/**
		 * Empleni un mapa LinkedHashMap amb claus de tipus String i objectes del tipus 
		 * que prefereixi. 
		 * 
		 * Extregui les parelles, ordeni-les segons les claus (en ordre alfabètic) 
		 * i torni a inserir-les en el mapa. 
		 * Idea: Fes servir un ArrayList per realitzar l'ordenació amb la classe Comparator.
		 */
		LinkedHashMap<String, Month> mesos = new LinkedHashMap<String, Month>();
		mesos.put("Gener", new Month("gener",31));
		mesos.put("Febrer", new Month("febrer",28));
		mesos.put("Març", new Month("març",31));
		mesos.put("Abril", new Month("abril",30));
		mesos.put("Maig", new Month("maig",31));
		mesos.put("Juny", new Month("juny",30));
		mesos.put("Juliol", new Month("juliol",31));
		mesos.put("Agost", new Month("agost",31));
		
		System.out.println("LinkedHashMap: " + mesos);
		
		 List<Map.Entry<String, Month> > llista = 
				 new ArrayList<Map.Entry<String, Month> >(mesos.entrySet());
		 
		 System.out.println("ArrayList: " + llista);
		 
		 Collections.sort(llista,
		            new Comparator<Map.Entry<String, Month> >() {
		                // Comparing two entries by value
		                public int compare(
		                    Map.Entry<String, Month> entry1,
		                    Map.Entry<String, Month> entry2){
		                    // Substracting the entries
		                    return entry1.getKey().compareTo(entry2.getKey());
		                }
		            });
		 
		 System.out.println("ArrayList: " + llista);
		
	}
	
}

