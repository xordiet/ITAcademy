package n1_f1_ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import n1_f1_ex1.Filtrable;
import n1_f1_ex1.Pais;


public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(34 , 22 , 5 , 52 , 43 , 98 , 98 , 68 , 18 , 7 , 72 , 67 , 14 , 73 , 83 , 29 , 12 , 46 , 31 , 68);
				
		List<String> resultat = new ArrayList<>();	
		EsParell espar = i -> (i % 2)==0;	
		for (Integer i: numeros) {
			if(espar.esParell(i))
				resultat.add("e"+i);
			else
				resultat.add("o"+i);
		}
		System.out.println(resultat);
		
		List<String> retorn = parellSenar(numeros, i -> (i % 2)==0);
		System.out.println(retorn);
		
		
	}
	
	public static List<String> parellSenar(List<Integer> llistat, EsParell tester) {
		List<String> modificada = new ArrayList<>();
		for (Integer i : llistat) {
	        if (tester.esParell(i)) {
	        	modificada.add("e"+i);
	        } else {
	        	modificada.add("o"+i);
	        }
	    }
		return modificada;
	}
}
