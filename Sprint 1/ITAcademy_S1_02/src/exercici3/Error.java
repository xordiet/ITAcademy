package exercici3;

public class Error {
	
	/**
	 * Exercici 3. 
	 * Escrigui codi per a generar i capturar una excepció 
	 * ArrayIndexOutOfBoundsException.
	 */
	
	public static void main(String[] args) {
		int [] meuaMatriu = new int[5];
		
		/*
		 * En aquest bloc faig un try...cath per cada iteració
		 * i per tant farà si o sí les 7 iteracions i em llançarà
		 * dos errors que capturaré
		 for (int i=0; i<7; i++) {
			try {
				meuaMatriu[i]=i;
				System.out.println("guardat "+i);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} 
			
		}
		*/
		
		/*
		 * En aquest altre bloc hi poso el bucle dins el try i per
		 * tant a la que llança el primer error surt del bucle i continúa
		 * només em llançarà un error el primer quan sobrepassi la mida.
		 */
		try {
			for (int i=0; i<7; i++) {
				meuaMatriu[i]=i;
				System.out.println("guardat "+i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Final de la lectura!");
		}

	}
	
}
