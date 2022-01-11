package org.itacademy.javatesting.junit;

import java.util.ArrayList;
import java.util.List;

public class Mesos {
	/**
	 * Exercici 1
	 * Creu una classe Java que insereixi en una llista ordenada 
	 * els noms dels mesos de l'any.
	 */	
	private List<String> m;
	
	public Mesos() {
		this.m = new ArrayList<String>();
		m.add("gener");
		m.add("febrer");
		m.add("març");
		m.add("abril");
		m.add("maig");
		m.add("juny");
		m.add("juliol");
		m.add("agost");
		m.add("setembre");
		m.add("octubre");
		m.add("novembre");
		m.add("desembre");
	}
	public String retornaMes(int i) {
		return this.m.get(i);
	}
	public int retornaLlarg() {
		return this.m.size();
	}
}
