package exercici2;

public class GenericMethods<T> {
	private T t;
	
	public static<T> void f(T a, T b, T c) {
		System.out.println("Tipus del primer valor: "+a.getClass());
		System.out.println("Tipus del segon valor: "+b.getClass());
		System.out.println("Tipus del tercer valor: "+c.getClass());
	}
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
