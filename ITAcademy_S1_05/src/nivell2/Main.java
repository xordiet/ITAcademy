package nivell2;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Main {
	
	/**
	 * Exercici 1. 
	 * Executa l'exercici 3 del nivell anterior parametritzant 
	 * tots els mètodes en un file de configuració..
	 */

	public static void main(String[] args) {
		String directori;
		String nomFitxer;
		String dirFitxer;
		Properties propietats = new Properties();
		try {
			//FileInputStream input = new FileInputStream("./src/nivell2/config.properties");
			FileInputStream input = new FileInputStream("./config.properties");
			propietats.load(input);
			//System.out.println(propietats.getProperty("nomFitxer"));
			directori = propietats.getProperty("directori");
			nomFitxer = propietats.getProperty("nomFitxer");
			dirFitxer = propietats.getProperty("dirFitxer");
			executa(directori, nomFitxer, dirFitxer);
		} catch (FileNotFoundException e1) {
			System.out.println("No s'ha trobat l'arxiu config.properties");
		} catch (IOException e) {
			System.out.println("No s'ha pogut llegir l'arxiu config.properties");
		}

	}
	
	static void executa(String directori, String nomFitxer, String dirFitxer) {
		FileWriter flwriter = null;
		String aGuardar = dirFitxer+nomFitxer;
		try {
			//fluxe per escriure a l'arxiu
			flwriter = new FileWriter(aGuardar);
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
		
		llegeix(directori, nomFitxer, dirFitxer);
	}
	
	static void llegeix(String directori, String nomFitxer, String dirFitxer) {
		String sCarpeta = directori;
		String aGuardar = dirFitxer+nomFitxer;
		try {
			LectorCarpetes ll = new LectorCarpetes();
			ll.llegirCarpeta(sCarpeta, aGuardar);
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
