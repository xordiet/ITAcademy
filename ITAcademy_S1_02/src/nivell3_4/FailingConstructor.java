package nivell3_4;

public class FailingConstructor {
	public FailingConstructor() {
		ClasseNova c1 = new ClasseNova();
		c1.dispose();
		
		try {
			int [] meuaMatriu = new int[5];
			meuaMatriu[8]=0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		ClasseNova c2 = new ClasseNova();
		c2.dispose();
	}
	
	public void dispose() {
		System.out.println("dispose() a FailingConstructor");
	}
}
