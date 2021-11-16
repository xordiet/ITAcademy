package intro00;

public class Moto extends Vehicle implements Producte {
	
	private int xx;
	private int yy;
	
	
	
	@Override
	public String toString() {
		return "Moto [xx=" + xx + ", yy=" + yy + "]";
	}
	
	@Override
	public float getPreu() {
		return 0;
	}
	@Override
	public String getDescripcio() {
		return null;
	}
	@Override
	void arrencar() {
		
	}
	
	

}
