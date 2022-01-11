package exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class LectorCarpetes {
	
	public void llegirCarpeta(String carpet) {
		LinkedHashSet<String> llisDirectoris = new LinkedHashSet<String>();
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
		    	String modificat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(arxiu.lastModified());
		    	System.out.println(String.format("(%s) %s %s",
		    			arxiu.isDirectory() ? "D" : "F",
		    			arxiu.getName(),
		    			modificat
		    			));
		    	if(arxiu.isDirectory()) {
		    		llisDirectoris.add(arxiu.getAbsolutePath());
		    	}
		    }
		}
		System.out.println();
		for(String d : llisDirectoris) {
			llegirCarpeta(d.toString());
		}
	}

}
