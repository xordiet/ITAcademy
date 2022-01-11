package nivell2_ex1;

public class Implementadora<T> implements MiInterfaz<T> {
	
	@Override
	public void metode1(T t) {
		System.out.println("   - Hola! Sóc el mètode 1 i m'heu passat "+t);
	}

	@Override
	public void metode2() {
		System.out.println("   - Hola! Sóc el mètode 2");		
	}
	
	public void metode3() {
		System.out.println("   - Hola! Sóc el mètode 3");		
	}

}
