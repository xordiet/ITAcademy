package nivell3;

public class Moto extends Vehicle {

	@Override
	public void arrencar() {
		super.arrencar();
	}

	@Override
	public String claxon() {
		return "meec, meec!";
	}
	
	/**
	 * @deprecated
	 * Aquest mètode està deprecated perquè ara hi ha motos elèctriques
	 * que no tenen la funcionalitat de donar gas...
	 */
	@Deprecated
	public void donarGas() {
		System.out.println("rrrrrr!");
	}
	
}
