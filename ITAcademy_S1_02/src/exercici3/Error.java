package exercici3;

public class Error {
	
	public static void main(String[] args) {
		int [] meuaMatriu = new int[5];
		
		for (int i=0; i<7; i++) {
			try {
				meuaMatriu[i]=i;
				System.out.println("guardat "+i);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			
			
		}

	}
	
}
