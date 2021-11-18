package nivell3_1;

public class Base {
	
	public Base() throws RuntimeException{
		System.out.println("Hola Excepció");
		throw new RuntimeException("Excepció RuntimeException");	
	}
	public Base(String missatge) throws RuntimeException{
		System.out.println("Hola " + missatge);
        throw new RuntimeException("Excepció RuntimeException a " + missatge);
    }

}
