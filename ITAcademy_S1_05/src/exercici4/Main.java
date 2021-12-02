package exercici4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	/**
	 * Exercici 4. 
	 * Afegeixi la funcionalitat de llegir qualsevol fitxer txt 
	 * i mostrar per consola el seu contingut..
	 */

	public static void main(String[] args) {
		//recullo els arguments
		int nArgs = args.length;
		String aAccio;
		String aCarpeta;
		String aArxiu;
				
		if ( nArgs >= 1 ) {
			aAccio = args[0];
			if (aAccio.equals("t")) {
				try {
					aArxiu = args[1];
					llegirT(aArxiu);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Heu d'especificar un segon argument amb l'arxiu .txt que voleu llegir");
				}
			} else if (aAccio.equals("c")) {
				aCarpeta = "";
				try {
					aCarpeta = args[1];
				} catch(ArrayIndexOutOfBoundsException e) {
					aCarpeta = System.getProperty("user.dir");
					System.out.println("no s'ha especificat un directori, es llegirà el directori actual");
				} finally {
					llegirC(aCarpeta);
				}
			} else {
				System.out.println("aAccio: "+aAccio);
				System.out.println("El primer argument ha de ser 't' per llegir un .txt o 'c' per llistar una carpeta");
			}
		} else {
			System.out.println("Nombre d'arguments incorrecte, heu d'introduïr-ne dos!");
		}
		
		

	}
	
	static void llegirT(String arxiu) {
		
		//System.out.println(arxiu);
		
		// crea el fluxe per llegir l'arxiu
		File file = new File(arxiu);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String linea = scanner.nextLine();
				System.out.println(linea);						
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("L'arxiu indicat no existeix.");
			System.out.println("Si us plau, introduiu un nom d'arxiu correcte");
			//e.printStackTrace();
		}		
	}
	
	static void llegirC(String carpeta) {
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
		
		llegeix(carpeta);
	}
	
	static void llegeix(String sCarpeta) {
		
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
