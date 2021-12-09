package nivell2_ex1;

public class Generica {
	
	public static<T> void metodeGeneric(Implementadora i){
		System.out.println("Hola! sóc el mètode genèric");
		System.out.println(i.metode1());
		i.metode2("Hola món!");
		i.metode3();
	}

}
