package nivell2_ex2;

public class ClaseGenerica {
	
	public static <T extends Interficie1> void metode1(T t) {
		System.out.println(t);
		
	}
	
	public static <U extends Interficie2> void metode2(U u) {
		System.out.println(u);
		
	}

}
