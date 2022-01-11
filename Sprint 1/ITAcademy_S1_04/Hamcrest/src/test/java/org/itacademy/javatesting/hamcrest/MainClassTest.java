package org.itacademy.javatesting.hamcrest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.Description; 
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.BaseMatcher;
import org.hamcrest.number.OrderingComparison;

public class MainClassTest extends TypeSafeMatcher{	
	
	/**
	 * Exercici 1. 
	 * Crea una llista d'enters. 
	 * Comprova que conte una llista de numeros en un determinat ordre, 
	 * i tambe que conte una llista en qualsevol ordre.
	 */
	@Test
	public void testExercici1a() {
		Integer nums[]=	{0,1,2,3,4,5};
		LlistaEnters l1 = new LlistaEnters(nums);
		LlistaEnters l2 = new LlistaEnters(nums);
		assertThat(l1.getLlista(), equalTo(l2.getLlista()));	
	}
	
	@Test
	public void testExercici1b() {
		Integer nums[]=	{0,1,2,3,4,5};
		LlistaEnters l1 = new LlistaEnters(nums);
		assertThat(l1.getLlista(), hasItems(3,2,1,4,5,0));
	}
	
	/**
	 * Exercici 2. 
	 * Fent servir aquesta mateixa llista d'enters, 
	 * comprova que cada element es mes gran que un determinat valor.
	 */
	@Test
	public void testExercici2() {
		Integer nums[]=	{2,3,4,5,6,7,8,9};
		LlistaEnters l1 = new LlistaEnters(nums);
		for (Integer i: l1.getLlista()) {
			//assertThat(i.toString(), i, greaterThan(1));
		}
	}
	
	/**
	 * Exercici 3. 
	 * Comprova que donat un alumne creat, aquest conte l'atribut 
	 * nom amb el valor 'Joan'.
	 */
	@Test
	public void testExercici4() {
		Alumne a = new Alumne("Joan", "Pérez", 23, "carrer inventat s/n, 08001 Barcelona");
		assertThat (a.getNom(), equalTo("Joan"));
	}
	
	/**
	 * Defineix un Matcher personalitzat per a Hamcrest que proporcioni 
	 * el Matcher de longitud per a un String.
	 */
	@Test
    public void testLongitudString1() {
		Cadena c = new Cadena("Mordorf");
        assertThat(c.getCadena(), length(is(6)));
    }
	
	
	@Test
	public void testLongitudString2() {
		Cadena c = new Cadena("Mordor");
		assertThat(c.getCadena(), length(is(6)));
	}
	 
	public static Matcher<String> length(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "S'esperava una cadena de longitud", "la cadena té una longitud de") {
            @Override
            protected Integer featureValueOf(String actual) {
              return actual.length();
            }
        };
	}
		
	@Override
	public void describeTo(Description descripcio) {
		descripcio.appendText("Missatge personalitzat");
		
	}
	@Override
	protected boolean matchesSafely(Object item) {
		// TODO Auto-generated method stub
		return false;
	}
}
