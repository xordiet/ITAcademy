package exercici1;

public class Error {
	
	/**
	 * Exercici 1. 
	 * Creu una classe amb un main() que generi un objecte de la classe 
	 * Exception dins d'un bloc try.Proporcioni al constructor de Exception 
	 * un argument String. 
	 * Capturi l'excepció dins d'una clàusula catch i imprimeixi l'argument String. 
	 * Afegeixi una clàusula finally i imprimeixi un missatge per a demostrar 
	 * que va passar per allí.
	 */

	public static void main(String[] args) {
		try {
        	AccioRandom();
        } catch (Exception e) {
        	//e.printStackTrace();
        	System.out.println(e.getMessage());
        } finally {
        	System.out.println("Amb error o no, finally s'executa! :))");
        }
	}
	
	static void AccioRandom() throws Exception {
		throw new Exception("Això és un error llançat expressament!");
	}

}
