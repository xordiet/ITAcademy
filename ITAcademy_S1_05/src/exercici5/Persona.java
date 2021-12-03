package exercici5;

import java.io.Serializable;

public class Persona implements Serializable {
	private String nom;
	private String cognoms;
	private int edat;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognoms() {
		return cognoms;
	}
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	
	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognoms=" + cognoms + ", edat=" + edat + "]";
	}
	
	

}
