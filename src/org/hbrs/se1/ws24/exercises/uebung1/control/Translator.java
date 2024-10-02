package org.hbrs.se1.ws24.exercises.uebung1.control;

/**
 * Das Translator Interface. Die Anzahl der Methoden ist fix
 * und darf NICHT erweitert werden. Sichtbarkeiten koennen
 * unter Umstaenden angepasst werden.
 *
 * @author saschaalda
 *
 */

interface Translator {
	
	double version = 1.0; // Version des Interface
	
	/*
	 * Uebersetzt eine numerische Zahl in eine String-basierte
	 * Repraesentation gemaess der Spezifikation in der Aufgabe 1-2 
	 */
    String translateNumber(int number);

} 








