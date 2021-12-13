package nivell3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Escola<List<?>> escola = new Escola<List<?>>();
		List<Escola<?>> llista = new ArrayList<Escola<?>>();
		
		Generic.metodeGeneric(escola);
		Generic.altreMetode(llista);
		
	}

}
