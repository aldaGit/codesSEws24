package org.hbrs.se1.ws24.demo.kapitel4;

public class Client {
	
	/**
	 *
	 * @author sascha
	 * Die Klasse Client hat eine Abhänigkeit zur Klasse Application.
	 * Diese kann aus mindestens einer dieser vier Gruenden bestehen:
	 * 1. Abhängigkeit über eine Instanzvariable (Abhängigkeit Nr. 1)
	 * 2. Abhängigkeit über einer lokalen Variable innerhalb einer Methode (Abhängigkeit Nr. 2)
	 * 3. Abhängigkeit über ein statisches Element (hier: eine statische Methode) (Abhängigkeit Nr. 3)
	 * 4. Verwendung in der Signatur einer Methode
	 */
    
    // Abhängigkeit Nr. 1 (Instanz-Variable)
    private Application app;
    
    public void print() {
        // Abhängigkeit Nr. 2 (lokale Variable)
        Application app;
        
        // Abhängigkeit Nr. 3 (Statische Methode)
        Application.log();
        
    }

    // Abhängigkeit Nr. 4 (Verwendung in der Signatur (hier: Eingabe-Parameter)
    public void amethod (Application app) {

	}
    
}
