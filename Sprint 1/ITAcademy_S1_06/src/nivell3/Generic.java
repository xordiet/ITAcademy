package nivell3;

import java.util.List;

public class Generic {
	
	public static<T> void metodeGeneric(Escola<List<?>> escola){
		System.out.println("Hola! sóc el mètode genèric 1");
		
	}
	
	public List<?> obte(){
		return null;
	}
	
	public static<T> void altreMetode(List<Escola<?>> llista) {
		System.out.println("Hola! sóc el mètode genèric 2");
		
	}


}
