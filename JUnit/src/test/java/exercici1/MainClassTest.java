package exercici1;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MainClassTest {
	/**
	 * Verifiqui amb jUnit que la llista té 12 posicions, 
	 * que no és nul·la i que en la seva posició 8 conté el nom 'Agost'.
	 */
	Mesos m = new Mesos();
	
	@Test
	public void inicialTest() {
		assertSame("la llista no té 12 posicions", 12, m.retornaLlarg());
	}
	@Test
	public void testNotNull() {
		assertNotNull("la llista és nula", m);
	}
	@Test
	public void vuiteAgost() {
		assertEquals("El vuitè més hauria de ser 'agost'", "agost", m.retornaMes(7));
	}

}
