package org.itacademy.javatesting.assertj;

public class AIOBException{
	
	private int [] meuaMatriu;
	
	public AIOBException() {
		meuaMatriu = new int[5];
	}
	
	public void guardaValor(int posicio, int valor) {
		try {
			meuaMatriu[posicio] = valor;
		} catch (IndexOutOfBoundsException e) {
			// TODO Aquí va el codi un cop capturada l'excepció
			throw e;
		}
		
		//meuaMatriu[posicio] = valor;
	}
	
}
