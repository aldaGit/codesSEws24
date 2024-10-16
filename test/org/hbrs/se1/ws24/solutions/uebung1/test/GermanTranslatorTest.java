package org.hbrs.se1.ws24.solutions.uebung1.test;

import org.hbrs.se1.ws24.solutions.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws24.solutions.uebung1.control.Translator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GermanTranslatorTest {

    private Translator translator = null;

    @BeforeEach
    public void setUp() {
        this.translator = new GermanTranslator();
    }


    @Test
    public void testPositive() {
        // Positiver Test
        assertEquals("vier", this.translator.translateNumber(4));

    }

    @Test
    public void testNegative() {
        // Negativer Test
        String test2 = "Übersetzung der Zahl -14 nicht möglich! (V " + Translator.version + ")";
        assertEquals(test2, this.translator.translateNumber(-14));
    }

    @Test
    public void testNero() {
        //  Test auf  Null.
        String test3 = "Übersetzung der Zahl 0 nicht möglich! (V " + Translator.version + ")";
        assertEquals(test3, this.translator.translateNumber(0));
    }

    @Test
    public void testBigNumber() {
        //  Test auf  Null.
        String test3 = "Übersetzung der Zahl 99 nicht möglich! (V " + Translator.version + ")";
        assertEquals(test3, this.translator.translateNumber(99));
    }
}