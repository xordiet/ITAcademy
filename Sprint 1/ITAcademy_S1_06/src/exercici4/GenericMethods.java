package exercici4;

public class GenericMethods<T> {
	private T t;
	
	public static<T> void f(String s, T ...a) {
		//El tipus del primer argument (String) no es mostrarà en pantalla
		int v = 1;
		for (T i : a) {
			System.out.println("Tipus del valor "+v+": "+i.getClass());
			v++;
		}

	}
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
