package nivell2_ex1;

public class Implementadora implements MiInterfaz {

	@Override
	public String metode1() {
		//System.out.println("Hola! Sóc el mètode 1");
		return "Hola! Sóc el mètode 1";
	}

	@Override
	public void metode2(String s) {
		System.out.println("Hola! Sóc el mètode 2 i m'heu passat el paràmetre "+s);		
	}
	
	public void metode3() {
		System.out.println("Hola! Sóc el mètode 3");		
	}

}
