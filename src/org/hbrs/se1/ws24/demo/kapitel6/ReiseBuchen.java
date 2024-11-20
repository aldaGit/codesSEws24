package org.hbrs.se1.ws24.demo.kapitel6;

public class ReiseBuchen {
	
	public void checkKunde( Kunde k ,  int type ) {
		k.setName( "Maier" );
		type = 3; 
	}
	
	public static void main(String[] args) {
		Kunde kunde = new Kunde();  
		kunde.setName("Schmidt"); 
		int type = 22;
		
		ReiseBuchen buchen = new ReiseBuchen();
		buchen.checkKunde( kunde , type );
		
		System.out.println(" Name des Kunden: " + kunde.getName() );
		System.out.println(" Type: " + type );
	}
}
