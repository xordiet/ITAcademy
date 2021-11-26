package org.itacademy.javatesting.hamcrest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.Description; 
import org.hamcrest.TypeSafeMatcher;


public class MainClassTest extends TypeSafeMatcher{	
	
	@Test
    public void testLongitudString1() {
		Cadena c = new Cadena("Mordorf");
        assertThat(c.getCadena(), length(is(6)));
    }
	
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
		descripcio.appendText("revisió de la longitud");
		
	}
	@Override
	protected boolean matchesSafely(Object item) {
		// TODO Auto-generated method stub
		return false;
	}
}
