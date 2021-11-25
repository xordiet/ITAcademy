package org.itacademy.javatesting.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class MainClassTest {
	/**
	 * Verifiqui amb jUnit que la llista té 12 posicions, 
	 * que no és nul·la i que en la seva posició 8 conté el nom 'Agost'.
	 */
	@Test
	public void inicialTest() {
		Mesos m = new Mesos();
		assertSame("la llista no té 12 posicions", 12, m.retornaLlarg());
	}
	@Test
	public void testNotNull() {
		Mesos m = new Mesos();
		assertNotNull("la llista és nula", m);
	}
	@Test
	public void testVuiteAgost() {
		Mesos m = new Mesos();
		assertEquals("El vuitè més hauria de ser 'agost'", "agost", m.retornaMes(7));
	}
	
	/*
	@Test
	public void dniTest() {
		fail("Aquest test es troba a l'arxiu TestDNI.java");
	}*/
	
	@Test
	public void testOutOfBounds() {
		Integer nums[]=	{0,1,2,3,4,5};
		IOBexcep er = new IOBexcep(nums);
		IndexOutOfBoundsException thrown = assertThrows(
			      IndexOutOfBoundsException.class,() -> er.error());
		assertEquals("Index 7 out of bounds for length 6", thrown.getMessage());
	
	}
	
	@Test
	public void testOutOfBounds2() {
		Integer nums[]=	{0,1,2,3,4,5};
		IOBexcep er = new IOBexcep(nums);
		try {
		    er.error(8);
		    fail("s'esperava un IndexOutOfBoundsException");
		  } catch (IndexOutOfBoundsException eo) {
			assertTrue(eo.toString().contains("IndexOutOfBoundsException"));
		  }		
	
	}
	

}

