package org.hbrs.se1.ws24.demo.kapitel4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Application implements GenericInterface {
	
	private String name;
	
    @Override
    public String getName() {
        return null;
    }
    
    public static void log(){
        // Statische Methode kann nicht ueberschrieben werden!
        System.out.println("Hello from Static-Method in Class");
    }


	public void printState() {
    	// Default-Methode kann ueberschrieben werden!
		System.out.println("Hello from overridden Method");

		// Aufruf der Methode aus dem Interface
		GenericInterface.super.printState();
	}

    public static void main ( String args[] ) {
        GenericInterface my = new Application();
        
        // Aufruf der überschriebenen Methode 
        my.getName();
        
        // Aufruf der Default-Methode aus Klasse
        // (die dann die Methode des Interface aufruft)
        my.printState();
        
        // Aufruf der statischen Methode aus Interface
        GenericInterface.log();
        
        // Aufruf der statischen Methode aus der Klasse (Cast notwendig)
        ((Application) my).log();
   
    }
 
}

