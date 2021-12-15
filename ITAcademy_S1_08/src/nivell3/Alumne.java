package nivell3;

public class Alumne {
	private String nom;
	private int edat;
	private String curs;
	private double nota;
	
	public Alumne(String nom, int edat, String curs, double d) {
		this.nom = nom;
		this.edat = edat;
		this.curs = curs;
		this.nota = d;
	}
	
	public String nomEdat() {
		return ("Hola em dic "+nom+" i tinc "+edat+" anys");
	}

	public char primCaracter() {
		return nom.charAt(0);
	}

	@Override
	public String toString() {
		return "Hola soc " + nom + ", tinc " + edat + " anys, estudio " + curs + " i tinc una nota de " + nota + " :)";
	}

	public String getCurs() {
		return curs;
	}

	public double getNota() {
		return nota;
	}

	public int getEdat() {
		return edat;
	}

}
