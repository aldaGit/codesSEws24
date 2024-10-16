package org.hbrs.se1.ws24.solutions.uebung1.control;

public class EnglishTranslator implements Translator {

	
	// Das initiale Array mit den Zahlen 
	private String[] zahlen = { "one", "two", "three" , "four" };

	public String date = "Okt/2024"; // Default-Wert


	/*
	 * 
	 * Methode zur Transformation einer numerischen Zahl in einen String
	 * Kompilierfehler deswegen, weil kein Return gegeben war.
	 *
	 */
	public String translateNumber(int number ) {
	
		String result = "";
		
		// Auswertung muss nicht zwingend in einem try-catch Block stehen, da es sich um eine
		// ungepruefte Exception handelt, die man nicht zwingend auffangen muss.
		// result = zahlen[  number - 1 ];
		
		try {
			// Aus dem Array wird durch eine Indexierung über die nummerische Zahl 
			// der String ausgewertet. Achtung: der Index eines Array faengt bei 0 an!
			// Eingabe 1 --> String = eins --> zu finden im Array an Index Nr. 0
			// Daher die Zahl stets um 1 zu verringern.
			result = zahlen[  number - 1 ];
		
		} catch (ArrayIndexOutOfBoundsException e) {
			
			result = "Translation of " + number + " is not possible! (V " + version + ")";
			
		} finally {
			// OK, man haette den Finally-Bock auch weglassen können und die Strings
			// direkt übergeben können... soll aber noch mal die Funktionsweise des Blocks
			// demonstrieren: dieser wird auf jeden Fall ausgefuehrt!
			// return result;
			return result;
		}
		
		
		
	}

	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: Nov/2020))
	 * Das Datum sollte system-intern gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}
}
