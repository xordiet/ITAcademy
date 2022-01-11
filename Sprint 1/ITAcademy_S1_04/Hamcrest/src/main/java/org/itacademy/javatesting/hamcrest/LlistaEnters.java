package org.itacademy.javatesting.hamcrest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LlistaEnters {
	private List<Integer> llista;

	public LlistaEnters(Integer[] elements) {
		this.llista = new ArrayList<Integer>(Arrays.asList(elements));
	}

	public List<Integer> getLlista() {
		return llista;
	}

}
