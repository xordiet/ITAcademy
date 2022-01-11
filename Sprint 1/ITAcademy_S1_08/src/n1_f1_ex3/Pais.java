package n1_f1_ex3;

public class Pais {
	private String nom;
	private char lletra;
	
	public Pais(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public boolean conte(char c) {
		lletra = c;
		boolean retorn = false;
		for(int i=0;i<nom.length();i++){
			if(nom.charAt(i)==c)
				retorn = true;
		}
		return retorn;
	}
		
	public void mostraPais() {
		System.out.println("Hola, sóc "+nom+" i el meu nom té una "+lletra);
	}

}
