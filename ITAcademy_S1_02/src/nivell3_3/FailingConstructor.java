package nivell3_3;

public class FailingConstructor {
	public FailingConstructor() {
		System.out.println("Primera línea del constructor");

		ClasseNova c1 = new ClasseNova();
		c1.dispose();
		
		try {
			int [] meuaMatriu = new int[5];
			meuaMatriu[8]=0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			ClasseNova c2 = new ClasseNova();
			c2.dispose();
		}		
		
		System.out.println("Darrera línea del constructor");
	}
}
