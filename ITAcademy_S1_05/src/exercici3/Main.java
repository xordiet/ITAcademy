package exercici3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	/**
	 * Exercici 3. 
	 * Executi l'exercici anterior guardant a un fitxer txt el resultat.
	 */

	public static void main(String[] args) {
		FileWriter flwriter = null;
		try {
			//fluxe per escriure a l'arxiu
			flwriter = new FileWriter("./arbre.txt");
			//fluxe intermedi
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			
			//tanca el fluxe intermedi
			bfwriter.close();
			System.out.println("Arxiu creat satisfactòriament..");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					//tanca el fluxe principal
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		llegeix(args);

	}
	
	static void llegeix(String[] args) {
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
			LectorCarpetes ll = new LectorCarpetes();
			ll.llegirCarpeta(sCarpeta);
		} catch (NullPointerException e) {
			System.out.println("Error al llegir el directori '" + sCarpeta 
				+ "' reviseu que s'ha introduït un directori existent");
		} catch (StackOverflowError e) {
			System.out.println("Error de sobrecàrrega "+ e.getMessage());
		} catch (Error e) {
			e.printStackTrace();
		}
	}

}
