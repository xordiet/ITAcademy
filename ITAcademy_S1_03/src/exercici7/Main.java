package exercici7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import exercici2.Month;

public class Main {

	public static void main(String[] args) {
		/**
		 * Empleni un HashMap amb parelles clau-valor. 
		 * Ordeni les parelles segons el codi hash i imprimeixi el resultat 
		 * (Idea: fer servir un TreeMap). 
		 */
		HashMap<String, Integer> gransCiutats = new HashMap<String, Integer>();
		gransCiutats.put("Barcelona", 1664182);
		gransCiutats.put("L'Hospitalet de Llobregat", 269382);
		gransCiutats.put("Terrassa", 223627);
		gransCiutats.put("Badalona", 223166);
		gransCiutats.put("Sabadell", 216520);
		gransCiutats.put("Lleida", 140403);
		gransCiutats.put("Tarragona", 136496);
		gransCiutats.put("Mataró", 129661);
		gransCiutats.put("Sta Coloma Gramenet", 120443);
		gransCiutats.put("Reus", 106168);
		System.out.println(gransCiutats);
		
		Map<String, String> treeMap = converteix(gransCiutats);
		System.out.println(treeMap);
		
		/**
		 * Extregui les parelles ordenades i introdueixi-les en un mapa 
		 * LinkedHashMap (Idea: fer servir el seu constructor). 
		 * Demostri que es manté l'ordre d'inserció.
		 */
		LinkedHashMap<String, String> linked = new LinkedHashMap<String,String>(treeMap);
		System.out.println(linked);
		
		/**
		 * Extregui només les claus ordenades 
		 * i introdueixi-les primer en un HashSet 
		 * i després en un LinkedHashSet. Es manté l'ordre?
		 */
		HashSet<String> hs = new HashSet<String>();
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		Set<Map.Entry<String, String>> entries = treeMap.entrySet();
		for (Map.Entry<String, String> entry : entries) {
            //System.out.println(entry.getKey());
			hs.add(entry.getKey());
			lhs.add(entry.getKey());
        }
		System.out.println(hs);		// NO manté l'ordre
		System.out.println(lhs);	// SÍ manté l'ordre
	}
	
	/**
	 * Mètode per convertir el HashMap (que inclou integers) a treeMap
	 */
	public static Map<String, String> converteix(Map<String, Integer> hashMap){
		Map<String, String> treeMap = new TreeMap<>();
		for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
            treeMap.put(e.getKey(), Integer.toString(e.getValue()));
        }
		return treeMap;
	}
	
}
