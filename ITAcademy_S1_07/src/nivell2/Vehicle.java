package nivell2;

import java.io.Serializable;

public class Vehicle implements Serializable{
	private String marca;
	private String model;
	
	public void arrencar() {
		System.out.println("brrroum!");
	}
	
	public String claxon() {
		return null;
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
