package org.hbrs.se1.ws24.demo.kapitel6;

import java.util.Date;
import java.util.List;

/**
 * CRUD-basiertes Interface für die Verwaltung von Buchungs-Objekten (vgl. Aufgabe 9-2c)
 */
public class BuchungDAO {
    // Persistente Erzeugung und Speicherung eines Objekts vom Typ Buchung
    void createBuchung( Buchung buchung ) {}
    Buchung createBuchung( BuchungDTO buchungDTO ) { return null; }

    // Weitere Methoden gemäß CRUD? [Todo]
    void deleteBuchung( Buchung buchung ) {}
    void updateBuchung( Buchung buchung ) {}
    Buchung getBuchung( int id ) { return null; };
    List<Buchung> getBuchungByDate( Date date ) { return null; }

}
