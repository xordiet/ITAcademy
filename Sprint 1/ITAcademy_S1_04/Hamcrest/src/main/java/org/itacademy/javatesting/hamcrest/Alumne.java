package org.itacademy.javatesting.hamcrest;

public class Alumne {
	/**
	 * Exercici 3. 
	 * Crea una classe anomenada Alumne, 
	 * amb els aributs: nom, cognom, edat, adreça. 
	 */
	private String nom;
	private String cognom;
	private int edat;
	private String adresa;
	
	public Alumne(String n, String c, int e, String a) {
		nom = n;
		cognom = c;
		edat = e;
		adresa = a;
	}
	public Alumne(String n) {
		nom = n;
	}
	
	public String getNom() {
		return nom;
	}

}
