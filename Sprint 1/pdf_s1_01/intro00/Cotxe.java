package intro00;

public class Cotxe extends Vehicle implements Producte {
	
	//atributs propis
	public final int numPortes;
	public static int capacitatMaleter;
	public Radio radio;
	
	public class Radio{
		boolean encesa;
		double frequencia=105.00;
		public void encendre() {};
		public void apagar() {};
	}
	
	@Override
	public String toString() {
		return "Cotxe [numPortes=" + numPortes + ", radio=" + radio + "]";
	}

	@Override
	void arrencar() {
		
	}
	
	public Cotxe() {
		super();
		this.numPortes = 4;
		this.capacitatMaleter = 200;
		this.radio = new Radio();
	}
	
	public Cotxe(String color, int cavalls, String marca, String model, int numPortes, int capacitatMaleter) {
		super(color, cavalls, marca, model);
		this.numPortes = numPortes;
		this.capacitatMaleter = capacitatMaleter;
		this.radio = new Radio();
	}
	
	public void setRadio(Radio radio) {
		this.radio = radio;
	}

	public int getNumPortes() {
		return numPortes;
	}
	/*public void setNumPortes(int numPortes) {
		this.numPortes = numPortes;
	}*/
	public int getCapacitatMaleter() {
		return capacitatMaleter;
	}
	public void setCapacitatMaleter(int capacitatMaleter) {
		this.capacitatMaleter = capacitatMaleter;
	}

	@Override
	public float getPreu() {
		return 0;
	}

	@Override
	public String getDescripcio() {
		return "";
	}

}
