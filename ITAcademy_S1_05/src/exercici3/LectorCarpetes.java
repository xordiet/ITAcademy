package exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class LectorCarpetes {
	
	private LinkedHashSet<String> llisDirectoris;
	private FileWriter flwriter;
	
	public void llegirCarpeta(String carpet) {
		llisDirectoris = new LinkedHashSet<String>();
		llegirCarpet(carpet);			
		
		for(String d : llisDirectoris) {
			llegirCarpeta(d.toString());
		}	
		
	}
	
	public void llegirCarpet(String carpet) {
		
		flwriter = null;
		try {
			//fluxe per escriure a l'arxiu, el segon paràmetre indica que afegirem més linees i no sobreescrivim
			flwriter = new FileWriter("./arbre.txt", true);
			//fluxe intermedi
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			
			//Aquí executem la lectura de carpetes i escrivim!
			File carpeta = new File(carpet);		
			System.out.println("/*******************");
			bfwriter.write("/*******************\n");
			System.out.println("* Carpeta a llegir: ");
			bfwriter.write("* Carpeta a llegir: \n");
			System.out.println("* "+carpeta);
			bfwriter.write("* "+carpeta+"\n");
			System.out.println("********************/");
			bfwriter.write("********************/\n");
			File[] llistat = carpeta.listFiles();
			Arrays.sort(llistat);
		
			if (llistat.length == 0) {
			    System.out.println("El directori és buit. No hi ha cap arxiu a la carpeta especificada");
			    bfwriter.write("El directori és buit. No hi ha cap arxiu a la carpeta especificada\n");
			    return;
			} else {
			    for (int i=0; i< llistat.length; i++) {
			    	File arxiu = llistat[i];
			    	String modificat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(arxiu.lastModified());
			    	System.out.println(String.format("(%s) %s %s",
			   			arxiu.isDirectory() ? "D" : "F",
			   			arxiu.getName(),
		    			modificat));
				    
				    bfwriter.write(String.format("(%s) %s %s \n",
				    		arxiu.isDirectory() ? "D" : "F",
				    		arxiu.getName(),
				    		modificat));
				    if(arxiu.isDirectory()) {
				    	llisDirectoris.add(arxiu.getAbsolutePath());
				    }
			    }
			}
			System.out.println();
			bfwriter.write("\n");
			
			//tanca el fluxe intermedi
			bfwriter.close();
			System.out.println("Arxiu modificat satisfactòriament..");
			
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

		
	}
}
