package org.hbrs.se1.ws24.demo.kapitel6;

public class KundenTausch {
	
	public void tauscheKunden( Kunde kunde1 , Kunde kunde2 ){
		Kunde temp = null;
		temp = kunde1;
		kunde1 = kunde2;
		kunde2 = temp;
		
		System.out.println(" Name des Kunden1 (lokal): " + kunde1.getName() );
		System.out.println(" Name des Kunden2: (lokal) " + kunde2.getName() );
	}

	public static void main(String[] args) {
		Kunde kunde1 = new Kunde(); 
		kunde1.setName("Müller"); 
		
		Kunde kunde2 = new Kunde();
		kunde2.setName("Schmidt"); 
		
		KundenTausch tausch = new KundenTausch();
		tausch.tauscheKunden( kunde1, kunde2 );
		
		System.out.println(" Name des Kunden1: " + kunde1.getName() );
		System.out.println(" Name des Kunden2: " + kunde2.getName() );

	}
	
	
	
	

}
