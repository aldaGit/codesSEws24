package org.hbrs.se1.ws24.demo.testobjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Herleitung Flyweight Pattern
public class StringTester {

    @Test
    public void testStringS() {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        // Assertions für Objekt-Gleichheit (mit assertEquals und assertTrue)
        assertEquals(str1, str2);
        assertTrue( str1.equals(str2));
        assertTrue( str1.equals(str3));

        // Assertions für Objekt-Identität (mit assertSame und assertTrue)
        assertTrue( str1 == str2 );
        assertSame(str1, str2);
        assertNotSame(str1, str3);

    }






    @Test
    public void testStringSolution() {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String ("abc");


        // Alle diese Assertions sind gueltig, da auf den Inhalt (Objektgleichheit)
        // geprueft wird. Die Inhalte sind bei allen Objekten gleich
        assertEquals( str1, str2  );
        assertEquals( str2, str1  );
        assertEquals( str1, str3  );

        // Diese Assertion ist gueltig, obwohl scheinbar zwei Objekte in zwei Variablen
        // abgelegt wurden. Jedoch werden instanziierte Strings auf einen Pool abgelegt.
        // Bei einer wiederholten Instanziierung eines Strings wird geschaut, ob dieser
        // String schon mal instanziiert wurde.
        // Wenn JA, dann wird die Referenz darauf zurückgegeben aus dem Pool,
        //       es wird kein neues Objekt erzeugt.
        // Wenn NEIN, dann ein neues Objekt erzeugt und auf den Pool gelegt.
        //
        // Angewandtes Pattern hier: das FlyWeight Pattern (nur auf Strings anzuwenden,
        // nicht auf "normale" Instanztypen).
        assertSame( str1, str2 );

        // Diese Assertion ist gueltig, da mit new String("abc") explizit ein neues
        // Objekt angelegt wurde, das nicht auf den Pool kommt
        assertNotSame(  str1 , str3 );

        // assertSame ( str1 , str3 ) --> waere nicht gueltig!

        // Gueltig, da mit demm == Operator auf Objektidentitaet geprueft wird
        assertTrue ( str1 == str2  ); // Achtung: ein und daselbe Objekt!
        assertFalse ( str1 == str3 ); //Achtung: zwei verschiedene Objekte hier!!

        // Die Gleichheit von Strings NIE mit == ueberpruefen:
        assertTrue (  str1.equals( str3 )  ); // ist gueltig ... aber:
        // assertTrue ( str1 == str3 ); // ACHTUNG: nicht gueltig, da hier nicht auf Gleichheit geprueft wird!!


    }

}

