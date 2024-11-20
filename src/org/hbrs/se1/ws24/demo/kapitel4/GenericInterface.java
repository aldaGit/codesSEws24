package org.hbrs.se1.ws24.demo.kapitel4;

public interface GenericInterface {
    
    public String getName();
    
    default void printState() { 
        System.out.println("Hello from Default Method in Interface");
        
    }
    
    static public void log() {
        System.out.println("Hello from Static Method in Interface");
        
    }  
}
