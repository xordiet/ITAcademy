package nivell3_1;

public class Derivada extends Base{
	public Derivada() throws Exception {
		//Si posem el super() al try (per capturar) dona error perquè
		//super() ha de ser la primera línea de codi
		super();
		try {
			System.out.println("try derivada");
		} catch (RuntimeException e) {
			System.out.println("catch derivada");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally derivada");
			this.toString();
		}
	}
}
