package exercici1;

public class Vehicle {
	private String marca;
	private String model;
	
	public void arrencar() {
		System.out.println("brrroum!");
	}
	
	public String claxon() {
		return "piip piip";
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	

}
