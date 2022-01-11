package exercici8;

public class Month {
	
	private String nom;
	private int dies;
	
	public Month(String nom) {
		this.nom = nom;
	}
	public Month(int dies) {
		this.dies = dies;
	}
	public Month(String nom, int dies) {
		this.nom = nom;
		this.dies = dies;
	}
	public String toString() {
		return ("El mes " + nom + " té " + dies + " dies");
	}

}
