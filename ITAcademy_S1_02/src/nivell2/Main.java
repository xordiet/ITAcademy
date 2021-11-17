package nivell2;

public class Main {

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