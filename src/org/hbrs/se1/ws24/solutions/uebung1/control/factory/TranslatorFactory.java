package org.hbrs.se1.ws24.solutions.uebung1.control.factory;

import org.hbrs.se1.ws24.solutions.uebung1.control.EnglishTranslator;
import org.hbrs.se1.ws24.solutions.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws24.solutions.uebung1.control.Translator;

/**
 * Factory-Klasse zur konsistenten und zentralen Erstellung von Translator-Objekten
 * (Design Pattern Factory Method (Gamma, 1995), siehe SE-1, Kapitel 6)
 * 
 * @author saschaalda
 *
 */
public class TranslatorFactory {

	public static Translator createGermanTranslator() {
		// Vorteil hier: der Typ kann hier und auch NUR hier ausgetauscht werden
		// Auch die Objektparametrisierung (z.B. das initiale Setzen eines Datums)
		// kann zentral organisiert werden
		GermanTranslator translator = new GermanTranslator();
		translator.setDate("11-11-2024");
		return translator;
	}

	public static Translator createEnglishTranslator() {
		// Vorteil hier: der Typ kann hier und auch NUR hier ausgetauscht werden
		// Auch die Objektparametrisierung kann zentral organisiert werden
		EnglishTranslator translator = new EnglishTranslator();
		translator.setDate("Nov-11th-2024");
		return translator;
	}
}
