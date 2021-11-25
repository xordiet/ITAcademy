package exercici1;

import java.util.ArrayList;

public class Mesos {
	
	/**
	 * Creu una classe Java que insereixi en una llista ordenada 
	 * els noms dels mesos de l'any.
	 */
	ArrayList<String> mesos = new ArrayList<String>();
	
	public Mesos() {
		mesos.add("gener");
		mesos.add("febrer");
		mesos.add("març");
		mesos.add("abril");
		mesos.add("maig");
		mesos.add("juny");
		mesos.add("juliol");
		mesos.add("agost");
		mesos.add("setembre");
		mesos.add("octubre");
		mesos.add("novembre");
		mesos.add("desembre");
	}
	public String retornaMes(int i) {
		return mesos.get(i);
	}
	public int retornaLlarg() {
		return mesos.size();
	}
}
