package nivell2;

import java.util.ArrayList;

@MevaAnotacio(directori = "../")
public class Main {
	
	static ArrayList<Vehicle> array;

	public static void main(String[] args) {
		array = new ArrayList<>();
		
		Moto m1 = new Moto();
		Cotxe c1 = new Cotxe();
		Cotxe c2 = new Cotxe();

		m1.setMarca("Silence");
		m1.setModel("S01");

		c1.setMarca("Citröen");
		c1.setModel("Berlingo");
		
		c2.setMarca("Opel");
		c2.setModel("Astra");
		
		array.add(m1);
		array.add(c1);
		array.add(c2);
		
		for(Vehicle k : array) {
			System.out.println(k.getMarca()+" "+k.getModel());
		}
		
		
	}

}
