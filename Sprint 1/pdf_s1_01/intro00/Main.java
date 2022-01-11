package intro00;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> llista = new ArrayList<Vehicle>();
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			System.out.println("[1] Moto o [2] Cotxe?");
			int opcio = sc.nextInt();
			if (opcio==1) {
				Moto meuaMoto = new Moto();
				llista.add(meuaMoto);
			} else {
				Cotxe meuCotxe = new Cotxe();
				llista.add(meuCotxe);
			}	
		}
		
		for (Vehicle v:llista) {
			/*if(v instanceof Moto) {
				System.out.println("Es tracta d'una moto");
			} else {
				System.out.println("Es tracta d'un cotxe");				
			}*/
			System.out.println(v);
		}

		
		/*
		Vehicle v1 = new Cotxe();
		Vehicle v2 = new Moto();
		Cotxe c3 = new Cotxe();
		Vehicle v3 = c3;
		Producte p3 = c3;
		
		//-----------
		
		//Vehicle v1 = new Vehicle();
		
		Cotxe c1 = new Cotxe();
		c1.capacitatMaleter = 30;
		Cotxe c2 = new Cotxe();
		c2.capacitatMaleter = 21;
		Cotxe c3 = new Cotxe();
		c3.capacitatMaleter = 54;
		System.out.println(c1.capacitatMaleter);
		System.out.println(c2.capacitatMaleter);
		System.out.println(c3.capacitatMaleter);
		
		Cotxe meuCotxe = new Cotxe();
		Cotxe.Radio laRadio = meuCotxe.new Radio();
		meuCotxe.setRadio(laRadio);
		laRadio.encendre();
		
		//-----
		
		Cotxe c1 = new Cotxe();
		c1.setColor("groc");
		c1.setCavalls(180);
		c1.setMarca("Nissan");
		c1.setModel("Primera");
		//c1.setNumPortes(5);
		c1.setCapacitatMaleter(200);
		System.out.println(c1.numPortes);
		
		Cotxe c2 = new Cotxe("groc", 180, "Nissan", "Primera", 5, 200);
		*/

	}

}
