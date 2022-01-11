package exercici2;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Moto v1 = new Moto();
		Cotxe v2 = new Cotxe();
		
		v1.arrencar();
		v1.donarGas();
		
		v2.arrencar();
		v2.donarGas();

	}

}
