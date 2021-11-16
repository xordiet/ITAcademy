package exercici4;

public class Error {

	public static void main(String[] args) {
		try {
        	AccioRandom();
        } catch (ErrorPropi e) {
        	//e.printStackTrace();
        	System.out.println(e.getMessage());
        }

	}
	
	static void AccioRandom() throws ErrorPropi {
		throw new ErrorPropi("Això és un error propi llançat expressament!");		
	}

}

class ErrorPropi extends Exception{
	
	public ErrorPropi() {
		
	}
	
	public ErrorPropi(String missError) {
		
		super(missError);
		
	}
}