package nivell3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		/**
		 * Crea una clase Alumne que tingui com a  propietats: 
		 * Nom, edat, curs i nota.  Omple la llista amb 10 alumnes.
		 */
		List<Alumne> llistat = new ArrayList<>();
		llistat.add(new Alumne("Jordi", 42, "Java", 9.5));
		llistat.add(new Alumne("Yolanda", 39, "Ukelele", 8));
		llistat.add(new Alumne("Anna", 16, "Php", 7));
		llistat.add(new Alumne("Joan", 75, "Anglès", 6.8));
		llistat.add(new Alumne("Pere", 15, "Java", 4));
		llistat.add(new Alumne("Gal·la", 32, "Pintura", 3.5));
		llistat.add(new Alumne("Bruna", 16, "JavaScript", 8));
		llistat.add(new Alumne("Albert", 17, "Cuina", 4));
		llistat.add(new Alumne("Martina", 18, "Php", 7));
		llistat.add(new Alumne("Vinyet", 15, "Robòtica", 7.5));
		
		/**
		 * Mostra per pantalla el nom i l’edat de cada alumne
		 */
		System.out.println("Nom i Edat:");
		llistat.forEach(a -> System.out.println(a.nomEdat()));
		
		/**
		 * Filtra la llista per tots els alumnes que el  nom comensi per “a”, 
		 * asigna-ho a un altre  llista y  mostra per pantalla la nova llista 
		 */
		System.out.println();
		System.out.println("Comencen per 'a'");
		List<Alumne> pera = (llistat.stream()
                .filter(s -> s.primCaracter()=='A'))
                .collect(Collectors.toList());
        for(Alumne a : pera) {
        	System.out.println(a.toString());
        }
        
        /**
         * Filtra y mostra per pantalla els alumnes que 
         * tinguin un 5 o mes de nota.
         */
        System.out.println();
		System.out.println("Tinguin un 5 o mes de nota");
		List<Alumne> mes5 = (llistat.stream()
                .filter(s -> s.getNota()>=5.0))
                .collect(Collectors.toList());
        for(Alumne a : mes5) {
        	System.out.println(a.toString());
        }
        
        /**
         * Filtra y mostra per pantalla els alumnes que 
         * tinguin un 5 o mes de nota y que no siguin  de PHP.
         */
        System.out.println();
		System.out.println("Tinguin un 5 o mes de nota");
		List<Alumne> m5np = (llistat.stream()
                .filter(s -> s.getNota()>=5.0))
				.filter(s -> !s.getCurs().equals("Php"))
                .collect(Collectors.toList());
        for(Alumne a : m5np) {
        	System.out.println(a.toString());
        }
        
        /**
         * Mostra tots  els alumnes que facin JAVA i siguin majors d’edat.
         */
        System.out.println();
		System.out.println("Tinguin un 5 o mes de nota");
		List<Alumne> jm18 = (llistat.stream()
                .filter(s -> s.getEdat()>18))
				.filter(s -> s.getCurs().equals("Java"))
                .collect(Collectors.toList());
        for(Alumne a : jm18) {
        	System.out.println(a.toString());
        }
		
	}

}
