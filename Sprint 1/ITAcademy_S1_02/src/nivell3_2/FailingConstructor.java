package nivell3_2;

public class FailingConstructor {
	public FailingConstructor() {
		System.out.println("Primera línea del constructor");
		int [] meuaMatriu = new int[5];
		try {
			meuaMatriu[7]=8;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println(meuaMatriu.length);
		}
		System.out.println("Quarta línea del constructor");
	}
}
