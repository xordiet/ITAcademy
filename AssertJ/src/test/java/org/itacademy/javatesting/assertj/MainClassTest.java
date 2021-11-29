package org.itacademy.javatesting.assertj;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class MainClassTest {
	@Test
	public void a_few_simple_assertions() {
		assertThat("The Lord of the Rings").isNotNull()   
	                                       .startsWith("The") 
	                                       .contains("Lord") 
	                                       .endsWith("Rings"); 
	  }
	
	@Test
	public void exercici1() {
		
	}
}
