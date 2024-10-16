package org.hbrs.se1.ws24.solutions.uebung1.control;

/**
 * Interface fuer Translator-Objekte, muss auf jeden Fall auf public gesetzt werden, sonst nicht sichtbar
 * fuer andere Packages
 * @author saschaalda
 *
 */
public interface Translator {
	
	public double version = 1.0; 
	
	public String translateNumber(int number);

} 
 