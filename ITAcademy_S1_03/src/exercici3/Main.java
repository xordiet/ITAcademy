package exercici3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import exercici1.Month;

public class Main {
	
	/**
	 * Utilitzi aquest generador per a emplenar un ArrayList, un LinkedList, 
	 * un HashSet, un LinkedHashSet i un TreeSet, i després imprimeixi per 
	 * pantalla cada contenidor.
	 * 
	 * Quins contenidors permeten elements repetits? 
	 * Quins contenidors permeten una ordenació per ordre natural o alfanumèric?
	 */

	public static void main(String[] args) {
		int num = 13;
		Generadora g = new Generadora();
		
		ArrayList<String> arrlt = new ArrayList<String>();
		for(int i =0; i<num; i++) {
			arrlt.add(g.seguentPersonatge());
		}
		System.out.print("ArrayList: ");
		System.out.println(arrlt);
		System.out.println("= Ordre natural amb repetits");
		System.out.println();
		
		LinkedList<String> lkdlt = new LinkedList<String>();
		for(int i =0; i<num; i++) {
			lkdlt.add(g.seguentPersonatge());
		}
		System.out.print("LinkedList: ");
		System.out.println(lkdlt);
		System.out.println("= Desordenat amb repetits");
		System.out.println();
		
		HashSet<String> hsst = new HashSet<String>();
		for(int i =0; i<num; i++) {
			hsst.add(g.seguentPersonatge());
		}
		System.out.print("HashSet: ");
		System.out.println(hsst);
		System.out.println("= Desordenat sense repetits");
		System.out.println();
		
		LinkedHashSet<String> lkhsst = new LinkedHashSet<String>();
		for(int i =0; i<num; i++) {
			lkhsst.add(g.seguentPersonatge());
		}
		System.out.print("LinkedHashSet: ");
		System.out.println(lkhsst);
		System.out.println("= Ordenat (comença per on vol) sense repetits");
		System.out.println();
		
		TreeSet<String> trst = new TreeSet<String>();
		for(int i =0; i<num; i++) {
			trst.add(g.seguentPersonatge());
		}
		System.out.print("TreeSet: ");
		System.out.println(trst);
		System.out.println("= Ordre alfanumèric sense repetits");
		System.out.println();
		
	}

}
