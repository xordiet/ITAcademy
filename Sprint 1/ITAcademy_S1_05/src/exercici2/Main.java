package exercici2;

public class Main {
	
	/**
	 * Exercici 2. 
	 * Afegeixi a la classe del nivell anterior la funcionalitat de 
	 * llistar un arbre de directoris amb el contingut de tots els 
	 * seus nivells (recursivamente) de manera que s'imprimeixin en 
	 * pantalla en ordre alfabètic dins de cada nivell, indicant a més 
	 * si és un directori (D) o un fitxer (F), i la seva última data 
	 * de modificació.
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
