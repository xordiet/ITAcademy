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
			try {
				throw new ErrorSegon("Aquest és el segon error!", e);
			} catch (RuntimeException f) {
				System.out.println("Excepció RuntimeException");
			}
			
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
