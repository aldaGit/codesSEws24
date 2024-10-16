package org.hbrs.se1.ws24.solutions.uebung1.view;

import org.hbrs.se1.ws24.solutions.uebung1.control.Translator;

public class ClientDI {

	/**
     * Implementierung einer einfachen Dependency Injection (DI; Kapitel 6)
	 *
	 */
	private Translator translator;

	public ClientDI(Translator translator ){
		this.translator = translator;
	}

	public void setTranslator(Translator translator) {
		this.translator = translator;
	}

	/*
	 * Methode zur Ausgabe einer Zahl auf der Console
	 *
	 */

	public void display( int aNumber ){
		// In dieser Methode soll die Methode translateNumber 
		// mit dem übergegebenen Wert der Variable aNumber 
		// aufgerufen werden.
		// Strenge Implementierung gegen das Interface Translator gewuenscht!

		// Referenz aktiv beziehen
		// Translator translator = // TranslatorFactory.createGermanTranslator(); // new GermanTranslator();
		String result = translator.translateNumber( aNumber );

		System.out.println("Das Ergebnis der Berechnung: " + result );

	}
}




