package org.hbrs.se1.ws24.solutions.uebung8.portal;

public class HotelSuche {

    public void main() {
        SuchAuftrag suchAuftrag = new SuchAuftrag();
        HotelSucheInterface service = new ReiseAnbieterAdapter();
        SuchErgebnis suchErgebnis = service.suche( suchAuftrag );
    }

}
