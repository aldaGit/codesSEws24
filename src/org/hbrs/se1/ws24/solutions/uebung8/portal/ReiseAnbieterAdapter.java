package org.hbrs.se1.ws24.solutions.uebung8.portal;
import org.hbrs.se1.ws24.solutions.uebung8.reiseanbieter.*;

public class ReiseAnbieterAdapter implements HotelSucheInterface {
	
	private ReiseAnbieter system; // = new ... hier ausgelassen

	@Override
	public SuchErgebnis suche(SuchAuftrag auftrag) {
		QueryObject q = this.transformIN(auftrag);
		QueryResult r =  this.system.executeQuery(q);
		SuchErgebnis se = this.transformOUT(r);
		return se;
	}
	
	private QueryObject transformIN( SuchAuftrag auftrag ) {
		// Transformation SuchAuftrag --> QueryObject
		return null;
	}
	
	private SuchErgebnis transformOUT( QueryResult result ) {
		// Transformation QueryResult --> SuchErgebnis
		return null;
	}



}
