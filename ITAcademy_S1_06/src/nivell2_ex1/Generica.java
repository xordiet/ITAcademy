package nivell2_ex1;

public class Generica {
	
	public static<T extends Implementadora> void metodeGeneric(T t){
		System.out.println("Hola! sóc el mètode genèric:");
		t.metode1(t);
		t.metode2();
		t.metode3();
	}

}
