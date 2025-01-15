package org.hbrs.se1.ws24.demo.testobjects;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * List zum Beweis, dass vor jeder Test-Methode ein neues Objekt
 * von der Test-Klasse erzeugt wird. Effekt somit: die Reihenfolge
 * der Test-Methoden ist nicht zu beruecksichtigen! Etwaige Aenderungen
 * in Objektvariablen werden ueberschrieben. Somit ist dieser gueltig,
 * da die Variable List wieder neu instanziiert wird.
 *
 * Quelle: http://martinfowler.com/bliki/JunitNewInstance.html
 *
 */
public class ListTester {
	
	private List<String> list = new ArrayList<String>();

	@Test
	public void testFirst() {
	    list.add("one");
	    assertEquals( 1, list.size() );
	}

	@Test
	public void testSecond() {
		assertEquals( 0, list.size() );
	}

}
