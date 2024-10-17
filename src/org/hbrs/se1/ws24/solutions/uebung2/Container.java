package org.hbrs.se1.ws24.solutions.uebung2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Container {

	/*
	 * Interne ArrayList zur Abspeicherung der Objekte
	 * Alternative: HashMap oder Set. HashMap hat vor allem Probleme 
	 * bei der Bewahrung der Konsistenz vom Key und Value (siehe TestStore, letzter Test)
	 */
	private List<Member> liste = new ArrayList<Member>();
	
	
	/*
	 * Methode zum Hinzufuegen einer Member.
	 * @throws ContainerException
	 */ 
	public void addMember ( Member r ) throws ContainerException {

		if (r == null) {
			ContainerException ex = new ContainerException();
			throw ex;
		}

		if ( contains( r ) == true ) {
			ContainerException ex = new ContainerException(  r.getID().toString() );
			throw ex;
		}
		liste.add( r );
	
	} 
	
	/*
	 * Methode zur Ueberpruefung, ob ein Member-Objekt in der Liste enthalten ist
	 * 
	 */
	private boolean contains(Member r) {
		Integer ID = r.getID();
		for ( Member rec : liste) {
			// wichtig: Check auf die Values innerhalb der Integer-Objekte!
			if ( rec.getID().intValue() == ID.intValue() ) {
				return true;
			}
		}
		return false;
		
		// liste.contains(r), falls equals-Methode in Member ueberschrieben.
	}
	/*
	 * Methode zum Loeschen einer Member
	 * In Praxis durchaus verwendet: C-Programme; beim HTTP-Protokoll; SAP-Anwendung (R3); Mond-Landung ;-)
	 * 
	 */
	public String deleteMember( Integer id ) {
		Member rec = getMember( id );
		if (rec == null) return "Member nicht enthalten - ERROR"; else {
			liste.remove(rec);
			return "Member mit der ID " + id + " konnte geloescht werden";
		}
	}
	
	/*
	 * Methode zur Bestimmung der Anzahl der von Member-Objekten
	 * Aufruf der Methode size() aus List
	 * 
	 */
	public int size(){
		return liste.size();
	}

	
	/*
	 * Methode zur Ausgabe aller IDs der Member-Objekte. Es werden verschiedene Varianten vorgestellt!
	 * Fuer eine ordnungsgemaesse Ausgabe sollten die unpassenden Varianten und und Loesungen
	 * natuerlich auskommentiert werden.
	 * 
	 */
	public void dump(){
		System.out.println("Ausgabe aller Member-Objekte: ");

		// Loesung mit Iterator:
		Iterator<Member> i = liste.iterator();
		while (  i.hasNext() ) {
			Member p = i.next();
			System.out.println("ID: " + p.getID() );
		}
		
		// Loesung Nr. 1 mit For each Schleife: Sequentielle Bearbeitung der Schleife
		for ( Member p : liste ) {
			System.out.println( p.toString()  );
		}
		
		// Loesung Nr. 2:
		// Implementierung mit forEach: eine Iteration wird hier nicht mehr
		// explizit beschrieben, sondern der Implementierung der Methode
		// forEach überlassen! Consumer: eine Parametrisierung eines Objekts mit einer Anweisung (Funktion),
		// die eine Aktion auf einem Element vom Typ T (hier: Member) darstellt. 
		// Consumer<T> ist ein Functional Interface
		liste.forEach( new Consumer<Member>() {
			@Override
			public void accept(Member p) {
				// Die Funktion
				System.out.println( p.toString()  );	
			}
		});
			 
		// Loesung Nr. 3:
		// Abkürzende Schreibweise für forEach mit einem LambaAusdruck
		// Ein Objekt wird mit einer Anweisung (Funktion) parametrisiert
		liste.forEach( (Member element) -> System.out.println(element));

		// Der Type Member kann auf der linken Seite weggelassen werden!
		liste.forEach( element -> System.out.println( element ) );

		// Ueber die Streaming-Funktion koennen weitere Filterungen durchgefuehrt werden
		// Dieses Vorgehen wird auch als Pattern Filter-Map-Reduce bezeichnet (vgl. Kapitel 4 bzw. 6
		// sowie die Uebung Nr. 4:		
		// Variante 4.1 (mit zwei Filtern und mit foreach als Reduzierung (reduce)):
		liste.stream() // Parallelisierung hier moeglich mit .parallelstream()
		      .filter( element -> element.getID() > 20 )
			  .filter(element -> element.getID() < 1000 )
			  .forEach(element -> System.out.println(element) );

		// Variante 4.2 (mit zwei Filtern und einer Reduzierung (reduce) auf eine Liste ohne foreach):		
		List<Integer> newListe = liste.stream() // Parallelisierung hier moeglich mit .parallelstream()
								      .filter( element -> element.getID() > 20 )
								      .filter(element -> element.getID() < 1000 )
								      .map( element -> element.getID() )
								      .collect( Collectors.toList() );
								     
		System.out.println( newListe );

        // Loesung Nr. 4:
        // Vorteil: Möglichkeit der parallelen Verarbeitung der Liste möglich
        // Erhöht die Performance der Anwendung
        liste.parallelStream().forEach( element -> System.out.println(element) );

        // Variante fuer die Variante Nr. 4.2:
		// Achtung: diese Variante ist im Gegensatz zur 4.2 nicht parallelisierbar!
		List<Integer> newListe2 = new ArrayList<Integer>();
		for ( Member p : liste ) {
			if (p.getID() > 20 && p.getID()<1000 ) {
				newListe2.add(p.getID());
			}
		}
		System.out.println(newListe2);

	}

	/**
	 * Interne Methode zur Ermittlung einer Member
	 * 
	 */
	private Member getMember(Integer id) {
		for ( Member rec : liste) {
			if (id == rec.getID().intValue() ){
				return rec;
			}
		}
		return null;
	}

}
