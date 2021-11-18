package nivell2_2;

public class Main {
	
	// TODO nivell 2 exercici 2
	/**
	 * 
	 * Repeteixi l'exercici anterior, 
	 * però dins de la clàusula catch, emboliqui l'excepció 'g()' 
	 * dins d'una RuntimeException.
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
			System.out.println(e.getMessage());
			throw new ErrorSegon("Aquest és el segon error!");
			
		}
	}
	
	static void g() throws ErrorPrimer {
		throw new ErrorPrimer("Aquest és el primer error!");
	}

}

class ErrorPrimer extends Exception{
	public ErrorPrimer(String msgError) {
		super(msgError);
	}
}

class ErrorSegon extends Exception{
	public ErrorSegon(String msgError) {
		super(msgError);
	}
}
