package n1_f1_ex1;

public class Seleccio implements Filtrable {

	@Override
	public boolean filtra(Pais p) {
		return p.getPrimCar()=='A' && p.getLlargada()==7 ;
	}

}
