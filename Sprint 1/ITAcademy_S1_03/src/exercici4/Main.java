package exercici4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		ArrayList<String> mesosAl = new ArrayList<String>();
		mesosAl.add("Gener");
		mesosAl.add("Febrer");
		mesosAl.add("Març");
		mesosAl.add("Abril");
		mesosAl.add("Maig");
		mesosAl.add("Juny");
		mesosAl.add("Juliol");
		mesosAl.add("Agost");
		mesosAl.add("Agost"); //per veure si accepta duplicats
		mesosAl.add("Setembre");
		mesosAl.add("Octubre");
		mesosAl.add("Novembre");
		mesosAl.add("Desembre");
		Itera.iterCollection(mesosAl);

		System.out.println();
		LinkedList<String> mesosLl = new LinkedList<String>();
		mesosLl.add("Gener");
		mesosLl.add("Febrer");
		mesosLl.add("Març");
		mesosLl.add("Abril");
		mesosLl.add("Maig");
		mesosLl.add("Juny");
		mesosLl.add("Juliol");
		mesosLl.add("Agost");
		mesosLl.add("Agost"); //per veure si accepta duplicats
		mesosLl.add("Setembre");
		mesosLl.add("Octubre");
		mesosLl.add("Novembre");
		mesosLl.add("Desembre");
		Itera.iterCollection(mesosLl);
		
		System.out.println();
		HashSet<String> mesosHs = new HashSet<String>();
		mesosHs.add("Gener");
		mesosHs.add("Febrer");
		mesosHs.add("Març");
		mesosHs.add("Abril");
		mesosHs.add("Maig");
		mesosHs.add("Juny");
		mesosHs.add("Juliol");
		mesosHs.add("Agost");
		mesosHs.add("Agost"); //per veure si accepta duplicats
		mesosHs.add("Setembre");
		mesosHs.add("Octubre");
		mesosHs.add("Novembre");
		mesosHs.add("Desembre");
		Itera.iterCollection(mesosHs);
		
		System.out.println();
		LinkedHashSet<String> mesosLhs = new LinkedHashSet<String>();
		mesosLhs.add("Gener");
		mesosLhs.add("Febrer");
		mesosLhs.add("Març");
		mesosLhs.add("Abril");
		mesosLhs.add("Maig");
		mesosLhs.add("Juny");
		mesosLhs.add("Juliol");
		mesosLhs.add("Agost");
		mesosLhs.add("Agost"); //per veure si accepta duplicats
		mesosLhs.add("Setembre");
		mesosLhs.add("Octubre");
		mesosLhs.add("Novembre");
		mesosLhs.add("Desembre");
		Itera.iterCollection(mesosLhs);
		
		System.out.println();
		TreeSet<String> mesosTs = new TreeSet<String>();
		mesosTs.add("Gener");
		mesosTs.add("Febrer");
		mesosTs.add("Març");
		mesosTs.add("Abril");
		mesosTs.add("Maig");
		mesosTs.add("Juny");
		mesosTs.add("Juliol");
		mesosTs.add("Agost");
		mesosTs.add("Agost"); //per veure si accepta duplicats
		mesosTs.add("Setembre");
		mesosTs.add("Octubre");
		mesosTs.add("Novembre");
		mesosTs.add("Desembre");
		Itera.iterCollection(mesosTs);

	}

}
