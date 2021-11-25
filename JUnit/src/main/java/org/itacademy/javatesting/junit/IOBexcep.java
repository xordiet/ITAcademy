package org.itacademy.javatesting.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IOBexcep {
	/**
	 * Creu una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
	 */
	private List<Integer> llista;
	
	public IOBexcep(Integer[] elements) {
		this.llista= new ArrayList<Integer>(Arrays.asList(elements));
	}
	
	public int error() {
		return llista.get(7);
	}
	public int error(int i) {
		return llista.get(i);
	}
}
