package org.hbrs.se1.ws24.demo.invoice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Demonstration der Assertions aus Kapitel 7 (Folien 56-57)
 * Einige Assertions wurden korrigiert, um den Test erfolgreich zu machen
 */
public class InvoiceTestCases {
    private Invoice b1 = null;
    private Invoice b2 = null;


    @Test
    public void firstBlock() {
        b1 = new Invoice(200 , "EUR");
        b2 = new Invoice(200 , "EUR");

        assertEquals( b1, b2 );
        assertNotSame( b1, b2 ); // Folie: assertSame
        assertFalse(b1 == b2);
    }
    @Test
    public void testSecondBlock(){
        b1 = new Invoice(20 , "EUR");
        b2 = new Invoice(30 , "$");

        assertNotEquals( b1 , b2 ); // Folie: assertEquals
        assertNotSame( b1 , b2); // Folie: assertSame
        assertFalse( b1 == b2 );
    }

    @Test
    public void testThirdBlock(){
        b1 = new Invoice(20 , "EUR");
        b2 = new Invoice(20 , "EUR");
        Invoice b3 = b1;

        assertEquals( b1 , b3 );
        assertSame( b1 , b3 );
        assertTrue( b1 == b3 ); // assertFalse
    }

}
