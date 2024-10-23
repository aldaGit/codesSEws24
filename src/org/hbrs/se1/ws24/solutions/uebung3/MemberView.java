package org.hbrs.se1.ws24.solutions.uebung3;

import java.util.List;

public class MemberView {

    public void dump( List<Member> liste ) {
        System.out.println("Ausgabe aller Member-Objekte: ");
        // Loesung mit For each:
        for (Member p : liste) {
            System.out.println("ID: " + p.toString() );
        }
    }
}
