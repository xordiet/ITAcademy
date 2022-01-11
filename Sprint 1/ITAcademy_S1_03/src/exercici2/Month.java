package exercici2;

public class Month {
	/**
	 * Crea una classe anomenada Month amb un atribut "name" 
	 * (que emmagatzemarà el nom del mes de l'any).
	 */
	private String name;
	
	public Month(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
