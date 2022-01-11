package exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.println("Benvinguda!");
		System.out.println("Si us plau, indica que vols fer, (S)erialitzar o (D)eserialitzar?");
		String opcio = preguntaOpcio();
		if (opcio.equals("s") || opcio.equals("S")) {
			serialitzar();
		} else {
			deserialitzar();
		}
		entrada.close();
	}
	
	static String preguntaOpcio() {
		Boolean v;
		String opcio;
		
		do {
			opcio = entrada.nextLine();
			v = validaOpcio(opcio);
		} while(!v);
		return opcio;
	}
	
	static Boolean validaOpcio(String opcio) {
		Boolean retorn = false;
		switch(opcio) {
			case "S", "s":
				System.out.println("Has triat serialitzar!");
				retorn = true;
				break;
			case "D", "d":
				System.out.println("Has triat deserialitzar!");
				retorn = true;
				break;
			default:
				System.out.println("La opció '" + opcio + "' triada no existeix.");
				System.out.println("Si us plau, escull S per serialitzar o D per deserialitzar.");
		}
		return retorn;
	}
	
	static void serialitzar() {
		String nom;
		String cognoms;
		int edat;
		String id;
		
		Persona p = new Persona();
		System.out.println("Si us plau, escriu el nom de la nova persona:");
		nom = entrada.nextLine();
		p.setNom(nom);
		System.out.println("Si us plau, escriu els seus cognoms:");
		cognoms = entrada.nextLine();
		p.setCognoms(cognoms);
		System.out.println("Si us plau, escriu la seva edat (en números):");
		try {
			edat = entrada.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Heu indicat un valor no numèric, es guardarà 0");
			edat = 0;
		}
		p.setEdat(edat);
		entrada.nextLine();
		System.out.println("Ara indica un id amb el que es guardara el fitxer");
		id = entrada.nextLine();
		//Serialitzar
		try {
			ObjectOutputStream fitxer = new ObjectOutputStream(new FileOutputStream("./"+id+".ser"));
			fitxer.writeObject(p);
			fitxer.close();
			
		} catch(Exception e){
			System.out.println("Error al crear l'arxiu serialitzat");
		}
		System.out.println("Gràcies! hem acabat!");
	}
	
	static void deserialitzar() {
		ObjectInputStream recuperant;
		String arxiu;
		System.out.println("Si us plau, escriu el nom de l'arxiu a deserialitzar:");
		arxiu = entrada.nextLine();
		try {
			recuperant = new ObjectInputStream(new FileInputStream(arxiu));
			Persona pers = (Persona) recuperant.readObject();
			System.out.println(pers.toString());
			recuperant.close();
		} catch(Exception e){
			System.out.println("Error al llegir l'arxiu serialitzat");
			System.out.println(e.getMessage());
		}
		System.out.println("Gràcies! hem acabat!");
	}

}
