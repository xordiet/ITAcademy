package nivell2_1;

public class Main {
	/**
	 * 
	 * Creu una classe amb dos mètodes, 'f()' i 'g()'. 
	 * 
	 * En 'g()', generi una excepció d'un nou tipus. 
	 * 
	 * En 'f()' invoqui a 'g()', capturi la seva excepció i, 
	 * en la clàusula catch, generi una excepció diferent 
	 * (d'un segon tipus, també nou). 
	 * 
	 * Comprovi el codi en 'main()'.
	 * 
	 */
	
	
	public static void main(String[] args) {
		try {
			f();
		} catch (ErrorSegon e) {
			System.out.println(e.getMessage());
		}
	}

	static void f() throws ErrorSegon {
		try {
			g();
		} catch (ErrorPrimer e) {
			//System.out.println(e.getMessage());
			throw new ErrorSegon("Aquest és el segon error!", e);
			
		}
	}
	
	static void g() throws ErrorPrimer {
		throw new ErrorPrimer();
	}

}

class ErrorPrimer extends Exception{
	public ErrorPrimer() {}
	public ErrorPrimer(String msgError) {
		super(msgError);
	}
}

class ErrorSegon extends Exception{
	public ErrorSegon(String msgError) {
		super(msgError);
	}
	public ErrorSegon(String msgError, ErrorPrimer e) {
		super(msgError);
		System.out.println("Mostra causa: " + e);
	}
}
