package nivell2;

import java.util.Random;

/**
 * Creu una classe anomenada 'Numero' que contingui un objecte 
 * Integer que s'inicialitzi amb un valor comprès entre 0 i 100 
 * utilitzant java.util.Random.
 * Implementi la interficie Comparable en aquesta classe.
 */

public class Numero implements Comparable<Numero>{

	private Integer num;
	
	public Numero() {
		//num = (int) ((Math.random() * (100 - 0)) + 0);
		num = obteRandom(0,100);
		System.out.println("afegit: " + num);
	}
	
	private static int obteRandom(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "[num=" + num + "]";
	}
	
	@Override
	public int compareTo(Numero o) {
		return this.getNum().compareTo(o.getNum());
	}

}
