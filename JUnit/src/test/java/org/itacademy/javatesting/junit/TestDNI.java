package org.itacademy.javatesting.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
* Creu una classe jUnit que verifiqui el seu correcte funcionament, 
* parametritzant-la perquè el test rebi un espectre de dades ampli i 
* validi si el càlcul és correcte per a 10 números de DNI predefinits.
*/
@RunWith(Parameterized.class)
public class TestDNI {

	@Parameters(name = "{index}: dni({0})={1}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
            {53060664,"D"},{53060665,"X"},{43456218,"H"},{38707338,"V"},{12345678,"Z"},
            {87654321,"X"},{00000001,"R"},{01234567,"J"},{90123456,"A"},{88888888,"Y"}
		});
	}
	
	private int numero;
	private String lletra;
	
	public TestDNI(int numero, String lletra) {
		this.numero = numero;
		this.lletra = lletra;
	}
	
	@Test
	public void TestlletraDNI() {
		CalculDNI c = new CalculDNI(numero);
		assertEquals(lletra, c.obteLletra());
	}

}
