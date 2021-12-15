package nivell2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
	
	static String [][] matriu = new String[3][3];

	public static void main(String[] args) {
		/**
		 * Feu una matriu  que contingui algunes cadenes de  text  y numeros. 
		 * Ordeneu-lo per...
		 */
		popula();
		//imprimeix(matriu);
		
		System.out.println("original");
		List<String> llistat = creallista(matriu);
		llistat.forEach(m -> System.out.print(m+", "));
		System.out.println();
		System.out.println();
		
		System.out.println("per llargada");
		/*
		Comparator<String> llargada = (String s1, String s2) -> (int) (s1.length() - s2.length());
		Collections.sort(llistat, llargada);
		llistat.forEach(m -> System.out.print(m+" "));
		System.out.println();
		*/
		String llargada = llistat.stream()
				.sorted((s1, s2) -> (int) (s1.length() - s2.length()))
				.collect(Collectors.joining(", "));
        System.out.println(llargada);
		System.out.println();		
		
		System.out.println("longitud inversa");
		String longInv = llistat.stream()
				.sorted((s1, s2) -> (int) (s2.length() - s1.length()))
				.collect(Collectors.joining(", "));
        System.out.println(longInv);
		System.out.println();
		
		System.out.println("alfabèticament");
		/*
		Comparator<String> alfabetica = (String s1, String s2) -> (int) (s1.compareTo(s2));
		Collections.sort(llistat, alfabetica);
		llistat.forEach(m -> System.out.print(m+" "));
		System.out.println();
		*/
		String alfabetica = llistat.stream()
				.sorted((s1, s2) -> (int) (s1.compareTo(s2)))
				.collect(Collectors.joining(", "));
		System.out.println(alfabetica);
		System.out.println();

		System.out.println("primer 'b'");
		/*
		Comparator<String> primerB = (s1, s2) -> (int) ((s2.charAt(0)=='b'? 1 : 0) - (s1.charAt(0)=='b'? 1 : 0)); 	
		Collections.sort(llistat, primerB);
		llistat.forEach(m -> System.out.print(m+" "));
		System.out.println();
		*/
		String primerb = llistat.stream()
				.sorted((s1, s2) -> (int) ((s2.charAt(0)=='b'? 1 : 0)- (s1.charAt(0)=='b'? 1 : 0)))
				.collect(Collectors.joining(", "));
		System.out.println(primerb);
		System.out.println();
		
		System.out.println("modifica a->4");
		Collections.sort(llistat, (String s1, String s2) -> (int) (s1.compareTo(s2)));
		llistat.replaceAll(s -> s.replace('a', '4'));
		llistat.forEach(m -> System.out.print(m+" "));
		System.out.println();
		System.out.println();
		
		System.out.println("només numerics");
		System.out.println("//Uso el llistat modificant 'a' per '4' perquè n'hi hagi més");		
		String numerics = llistat.stream()
                .filter(s -> s.matches("[+-]?\\d*(\\.\\d+)?"))
                .collect(Collectors.joining(", "));
        System.out.print(numerics);
		System.out.println();
		System.out.println();
        
        /**
         * Crea una Functional Interface que continga un mètode abstracte 
         * operacio (), que retorne un valor float; 
         * injecta a la interfície creada mitjançant una lambda el cos del 
         * mètode, de manera que pugis transformar la operació a una suma, 
         * resta, multiplicació i divisio. 
         */
        float a = 23;
        float b = 30;
        FuncInterf suma = () -> a+b;
        System.out.println(suma.operacio());
        FuncInterf resta = () -> a-b;
        System.out.println(resta.operacio());
        FuncInterf multi = () -> a*b;
        System.out.println(multi.operacio());
        FuncInterf divid = () -> a/b;
        System.out.println(divid.operacio());
        
	}
	
	public static void popula() {
		matriu[0][0]="a";
		matriu[0][1]="b";
		matriu[0][2]="c";
		matriu[1][0]="1";
		matriu[1][1]="2";
		matriu[1][2]="3";
		matriu[2][0]="a1";
		matriu[2][1]="b2";
		matriu[2][2]="c3";
	}
	
	public static void imprimeix(String[][] m) {
		for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println(m[i][j]);
            }
        }
	}
	
	public static List<String> creallista(String[][] m) {
		List<String> llista = new ArrayList<String>();
		for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                llista.add(m[i][j]);
            }
        }
		return llista;
	}
	
}
