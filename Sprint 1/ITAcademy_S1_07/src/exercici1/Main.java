package exercici1;

public class Main {

	public static void main(String[] args) {
		Vehicle v1 = new Moto();
		Vehicle v2 = new Cotxe();
		
		v1.arrencar();
		System.out.println(v1.claxon());
		
		v2.arrencar();
		System.out.println(v2.claxon());

	}

}
