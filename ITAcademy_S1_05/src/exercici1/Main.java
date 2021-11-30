package exercici1;

import java.io.File;
import java.util.Arrays;

public class Main {
	
	/**
	 * Exercici 1. 
	 * Creu una classe Java que llisti el contingut d'un directori 
	 * rebut per paràmetre ordenat alfabèticament.
	 */

	public static void main(String[] args) {
		String sCarpeta;

		//recullo els arguments
		int nArgs = args.length;
		if ( nArgs > 0 ) {
			sCarpeta = args[0];
			//System.out.println(sCarpeta);
		} else {
			sCarpeta = System.getProperty("user.dir");
			System.out.println("no s'ha especificat un directori, es llegirà el directori actual");
		}
		
		try {
			llegirCarpeta(sCarpeta);
		} catch (NullPointerException e) {
			System.out.println("Error al llegir el directori '" + sCarpeta 
					+ "' reviseu que s'ha introduït un directori existent");
		}
		
	}

	static void llegirCarpeta(String carpet) {
		File carpeta = new File(carpet);		
		System.out.println("/*******************");
		System.out.println("* Carpeta a llegir: ");
		System.out.println("* "+carpeta);
		System.out.println("********************/");
		File[] llistat = carpeta.listFiles();
		Arrays.sort(llistat);
		
		if (llistat.length == 0) {
		//if (llistat == null || llistat.length == 0) {
		    System.out.println("El directori és buit. No hi ha cap arxiu a la carpeta especificada");
		    return;
		} else {
		    for (int i=0; i< llistat.length; i++) {
		    	File arxiu = llistat[i];
		        System.out.println(arxiu.getName());
		    }
		}
		//System.out.println("Adeu Món!");		
	}
}
