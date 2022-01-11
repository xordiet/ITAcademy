package s1_01c;

public class Main {

	public static void main(String[] args) {
		
		Cycle c1 = new Unicycle();
		Cycle c2 = new Bicycle();
		Cycle c3 = new Tricycle();
		
		Cycle.ride(c1);
		Cycle.ride(c2);
		Cycle.ride(c3);
		
		/**
		 * Exercici 3. 
		 * Creu instàncies de tres tipus i generalitzi-les per a formar un 
		 * array d'objectes Cycle. Tracti d'invocar 'balance()' en cada element 
		 * de l'array. Realitza una especialització fent servir instanceof i 
		 * invoqui 'balance()' demostrant el que ocorre.
		 */
		Cycle array[] = new Cycle[3];
		array[0]=c1;
		array[1]=c2;
		array[2]=c3;
		
		for(Cycle c: array) {
			//si l'invoco directament dona error
			//c.balance();
			if(c instanceof Unicycle) {
				Unicycle u = (Unicycle)c;
				u.balance();
			} else if (c instanceof Bicycle) {
				Bicycle b = (Bicycle)c;
				b.balance();
			} else {
				System.out.println("Tricycle No té el mètode balance()");
			}
		}

	}

}
