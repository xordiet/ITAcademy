package nivell3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

import javax.crypto.*;
//import javax.crypto.spec.SecretKeySpec;

public class Main {
	
	/**
	 * Exercici 1. 
	 * Crea una utilitat que encripti i desencripti els fitxers 
	 * resultants dels nivells anteriors. Utilitza l'algorisme AES 
	 * en manera de treball ECB o CBC amb mètode d'ompliment PKCS5Padding. 
	 * Es pot emprar javax.crypto o bé org.apache.commons.crypto.
	 */

	public static void main(String[] args) {
		String directori;
		String nomFitxer;
		String dirFitxer;
		Properties propietats = new Properties();
		
		try {
			//FileInputStream input = new FileInputStream("./src/nivell3/config.properties");
			FileInputStream input = new FileInputStream("./config.properties");
			propietats.load(input);
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
		String desencriptat = dirFitxer+"desencriptat.txt";
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
		SecretKey clau = creaClauEncrip();
		encripta(aGuardar, clau);
		desencripta(aGuardar, desencriptat, clau);
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
	
	static SecretKey creaClauEncrip() {
		//Generem una clau AES de 128 bits
		SecretKey secretKey = null;
		KeyGenerator keygenerator;
		
		//String clau = "aaaabbbbccccdddd";
		//byte[] raw = clau.getBytes("UTF8");
		//SecretKey secretKey = new SecretKeySpec(raw, "AES");
		
		try {
			keygenerator = KeyGenerator.getInstance("AES");
			keygenerator.init(128);
			secretKey = keygenerator.generateKey();
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Error al generar la clau.");
			//e.printStackTrace();
		}
		return secretKey;
	}
	
	static void encripta(String aEncriptar, SecretKey secretKey) {
		String cadena = "Aquest és l'arxiu a encriptar: "+aEncriptar;
		System.out.println(cadena);
		try {
			//llegim l'arxiu creat i que s'ha d'encriptar
			File file = new File(aEncriptar);
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			byte[] bytIn = new byte[(int) file.length()];
			bis.read(bytIn);
			bis.close();
			
			//Encriptem el buffer que hem llegit més amunt
			Cipher xifram = Cipher.getInstance("AES/ECB/PKCS5Padding");
			xifram.init(Cipher.ENCRYPT_MODE, secretKey);
	        byte[] bytOut = xifram.doFinal(bytIn);  
	        File outfile = new File(aEncriptar);  
	        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outfile));  
	        bos.write(bytOut);  
	        bos.close();
	        
	        System.out.println("Arxiu encriptat satisfactòriament...");

		} catch(Exception e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
	}
	
	static void desencripta(String aDesencriptar, String desencriptat, SecretKey secretKey) {
		String cadena = "Aquest és l'arxiu a desencriptar: "+aDesencriptar;
		System.out.println(cadena);
		try {
			//llegim l'arxiu encriptat i que s'ha de desencriptar
			File file = new File(aDesencriptar);
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			byte[] bytIn = new byte[(int) file.length()];
			bis.read(bytIn);
			bis.close();
						
			//Desencriptem el buffer que hem llegit més amunt
			Cipher dexifram = Cipher.getInstance("AES/ECB/PKCS5Padding");
			dexifram.init(Cipher.DECRYPT_MODE, secretKey);
	        byte[] bytOut = dexifram.doFinal(bytIn);  
	        File outfile = new File(desencriptat);  
	        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outfile));  
	        bos.write(bytOut);  
	        bos.close();  
	        
	        
	        System.out.println("Arxiu alliberat satisfactòriament a " + desencriptat);	        	        
			
		} catch(Exception e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
	}

}
