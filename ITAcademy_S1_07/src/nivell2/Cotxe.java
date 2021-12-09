package nivell2;

public class Cotxe extends Vehicle{

	@Override
	public void arrencar() {
		super.arrencar();
	}

	@Override
	public String claxon() {
		return "mooc, mooc!";
	}
	
	/**
	 * @deprecated
	 * Aquest mètode està deprecated perquè ara hi ha cotxes elèctrics
	 * que no tenen la funcionalitat de donar gas...
	 */
	@Deprecated
	public void donarGas() {
		System.out.println("rrrrrr!");
	}

}
