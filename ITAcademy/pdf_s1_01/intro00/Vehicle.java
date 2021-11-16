package intro00;

public abstract class Vehicle {
	
	protected String color;
	protected int cavalls;
	protected String marca;
	protected String model;
	
	abstract void arrencar();
		
	public Vehicle() {
		this.color = "";
		this.cavalls = 0;
		this.marca = "";
		this.model = "";
	}

	public Vehicle(String color, int cavalls, String marca, String model) {
		this.color = color;
		this.cavalls = cavalls;
		this.marca = marca;
		this.model = model;
	}
	

	public Vehicle(String marca, String model, int cavalls, String color) {
		this.color = color;
		this.cavalls = cavalls;
		this.marca = marca;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCavalls() {
		return cavalls;
	}

	public void setCavalls(int cavalls) {
		this.cavalls = cavalls;
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
