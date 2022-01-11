package nivell3_2;

import java.util.Arrays;

public class Numeros {
	
	private int[] array = new int[0];
	
	public void add(int s) {
		array = (int[])redimensiona(array);
		array[array.length-1] = s;
	}
	
	private static int[] redimensiona (int[] vella) {
        int mida = vella.length;
        int[] nova = new int[mida+1];
        System.arraycopy(vella, 0, nova, 0, mida);
        return nova;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}

}
