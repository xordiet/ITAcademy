package exercici2;

public class Main {
	
	/**
	 * Exercici 1. 
	 * Creu una classe Java que llisti el contingut d'un directori 
	 * rebut per paràmetre ordenat alfabèticament.
	 */

	public static void main(String[] args) {
		String sCarpeta;

		//recullo els arguments
		int nArgs = args.length;
		if ( nArgs > 0 ) {
			sCarpeta = args[0];
			//System.out.println(sCarpeta);
		} else {
			sCarpeta = System.getProperty("user.dir");
			System.out.println("no s'ha especificat un directori, es llegirà el directori actual");
		}
		
		try {
			LectorCarpetes ll = new LectorCarpetes();
			ll.llegirCarpeta(sCarpeta);
		} catch (NullPointerException e) {
			System.out.println("Error al llegir el directori '" + sCarpeta 
					+ "' reviseu que s'ha introduït un directori existent");
		} catch (StackOverflowError e) {
			System.out.println("Error de sobrecàrrega "+ e.getMessage());
		} catch (Error e) {
			e.printStackTrace();
		}
		
	}

}
