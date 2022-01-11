package nivell3_1;

import java.util.Arrays;

public class Contenidora {
	
	/**
	 * Crea una classe anomenada 'Contenidora' que encapsuli un array d'objectes String. 
	 * Defineixi un mètode 'add' que només permeti afegir cadenes de caràcters. 
	 * Si l'array no és prou gran per a la següent inserció, 
	 * el contenidor ha de redimensionar automàticament aquest array.
	 */
	private String[] array = new String[0];
	
	public void add(String s) {
		array = (String[])redimensiona(array);
		array[array.length-1] = s;
	}
	
	private static String[] redimensiona (String[] vella) {
        int mida = vella.length;
        String[] nova = new String[mida+1];
        System.arraycopy(vella, 0, nova, 0, mida);
        return nova;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}

}
