package org.hbrs.se1.ws24.demo.invoice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTest {
    private Invoice b1 = null;
    private Invoice b2 = null;

    @BeforeEach
    public void setUp() throws Exception {
        b1 = new Invoice(200 , "EUR");
        b2 = new Invoice(200 , "EUR");
    }

    @Test
    public void testEquality() {
        assertEquals( b1, b2 );
    }
    @Test
    public void testSameIdentity(){
        assertSame( b1, b1 );
    }
    @Test
    public void testNotSameIdentity(){
        assertNotSame( b1 , b2 );
    }
}
