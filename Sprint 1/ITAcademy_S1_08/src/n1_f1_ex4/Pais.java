package n1_f1_ex4;

public class Pais {
	private String nom;
	
	public Pais(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public char getPrimCar() {
		return nom.charAt(0);
	}
	
	public int getLlargada() {
		return nom.length();
	}
	
	public void mostraPais() {
		System.out.println("Hola, sóc "+nom+" i tinc una llargada de "+getLlargada());
	}

}
