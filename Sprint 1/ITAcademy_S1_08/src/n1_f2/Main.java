package n1_f2;

public class Main {

	public static void main(String[] args) {
		InterfPi pival = () -> 3.1416;
		System.out.println(pival.getPiValue());
	}

}
