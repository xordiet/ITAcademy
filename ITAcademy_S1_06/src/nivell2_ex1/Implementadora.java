package nivell2_ex1;

public class Implementadora<K,V> implements MiInterfaz<K,V> {
	private K k;
	
	@Override
	public K metode1() {
		System.out.println("Hola! Sóc el mètode 1");
		return k;
		//return (K) "Hola! Sóc el mètode 1";
	}

	@Override
	public void metode2(V v) {
		System.out.println("Hola! Sóc el mètode 2 i m'heu passat el paràmetre "+v);		
	}
	
	public void metode3() {
		System.out.println("Hola! Sóc el mètode 3");		
	}

}
