package exercici1;

public class Error {

	public static void main(String[] args) {
		try {
        	AccioRandom();
        } catch (Exception e) {
        	//e.printStackTrace();
        	System.out.println(e.getMessage());
        } finally {
        	System.out.println("Amb error o no, finally s'executa! :))");
        }
	}
	
	static void AccioRandom() throws Exception {
		throw new Exception("Això és un error llançat expressament!");
	}

}
