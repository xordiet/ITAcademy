package n1_f3;

public class Main {

	public static void main(String[] args) {
		String pangrama = "Jove xef, porti whisky amb quinze glaçons d'hidrogen, coi!";
		
		MevaInterf capgira = (s) -> {
		    StringBuilder sb=new StringBuilder(s);  
		    sb.reverse();  
		    return sb.toString();
		};
		
		System.out.println(capgira.reverse(pangrama));

	}
	
	

}
