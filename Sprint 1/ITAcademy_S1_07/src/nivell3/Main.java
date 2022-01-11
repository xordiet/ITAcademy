package nivell3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import com.google.gson.Gson;

@MevaAnotacio(directori = "src/nivell2/")
public class Main {
	static String directori;
	static ArrayList<Vehicle> array;

	public static void main(String[] args) {
		array = new ArrayList<>();
		
		Moto m1 = new Moto();
		Cotxe c1 = new Cotxe();
		Cotxe c2 = new Cotxe();

		m1.setMarca("Silence");
		m1.setModel("S01");

		c1.setMarca("Citröen");
		c1.setModel("Berlingo");
		
		c2.setMarca("Opel");
		c2.setModel("Astra");
		
		array.add(m1);
		array.add(c1);
		array.add(c2);
		
		/**
		 * Serialització del json
		 */
		// obtenim la ruta de l'anotació
		Annotation annotation = Main.class.getDeclaredAnnotation(MevaAnotacio.class);
		Method[] methods = annotation.annotationType().getDeclaredMethods();
		for (Method method : methods) {
			if (method.getParameterTypes().length == 0 && method.getReturnType() != void.class) {
				try {
					Object value = method.invoke(annotation);
					//System.out.println(value.toString());
					directori = value.toString();
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
		
		//creem el json
		Gson gson = new Gson();
		String jsonString = gson.toJson(array);
		//System.out.println(jsonString);
		
		//i Guardem a l'arxiu
		try {
			String fileName = directori+"vehicles.json";
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		    writer.write(jsonString);
		    
		    writer.close();
			
		} catch(Exception e){
			System.out.println("Error al crear l'arxiu serialitzat");
		} finally {
			System.out.println("Acabat!");
		}
		
	}

}
