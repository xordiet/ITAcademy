package exercici2;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	
	/**
	 * Exercici 2. 
	 * Asseguri's que si convertim el Contenidor utilitzat en el 
	 * punt anterior a un Contenidor HashSet, aquest no permet duplicats. 
	 * Verifica-ho.
	 */

	public static void main(String[] args) {
		HashSet<Month> mesos = new HashSet<Month>();
		
		Month gener = new Month("Gener");
		Month febrer = new Month("Febrer");
		Month mars = new Month("Març");
		Month abril = new Month("Abril");
		Month maig = new Month("Maig");
		Month juny = new Month("Juny");
		Month juliol = new Month("Juliol");
		Month agost = new Month("Agost");
		Month setembre = new Month("Setembre");
		Month octubre = new Month("Octubre");
		Month novembre = new Month("Novembre");
		Month desembre = new Month("Desembre");
		
		if(mesos.add(gener)){
		}
		else {
			System.out.println("duplicat!!");
		}
		
		if(mesos.add(febrer)){
		}
		else {
			System.out.println("duplicat!!");
		}
		if(mesos.add(mars)){
		}
		else {
			System.out.println("duplicat!!");
		}
		if(mesos.add(abril)){
		}
		else {
			System.out.println("duplicat!!");
		}
		if(mesos.add(maig)){
		}
		else {
			System.out.println("duplicat!!");
		}
		if(mesos.add(juny)){
		}
		else {
			System.out.println("duplicat!!");
		}
		if(mesos.add(juliol)){
		}
		else {
			System.out.println("duplicat!!");
		}
		if(mesos.add(agost)){
		}
		else {
			System.out.println("duplicat!!");
		}
		if(mesos.add(setembre)){
		}
		else {
			System.out.println("duplicat!!");
		}
		if(mesos.add(octubre)){
		}
		else {
			System.out.println("duplicat!!");
		}
		if(mesos.add(novembre)){
		}
		else {
			System.out.println("duplicat!!");
		}
		if(mesos.add(desembre)){
		}
		else {
			System.out.println("duplicat!!");
		}
		
		for (Month i : mesos) {
			System.out.println(i.getName());
		}
		System.out.println();
		
		if(mesos.add(gener)) {
		}
		else {
			System.out.println("duplicat!!");
		}
		
		
		
		
		
	}

}
