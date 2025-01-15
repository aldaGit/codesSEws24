package org.hbrs.se1.ws24.solutions.uebung10.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTester {

    private MyStack<String> myStack;

    @BeforeEach
    public void setup() {
        this.myStack = new MyStack<String>( 4 );
    }

    @Test
    public void testStack() {
        assertTrue( myStack.empty() );

        this.myStack.push("sascha");
        this.myStack.push("sascha123");

        // Abfrage Zustand
        assertEquals( 2 , myStack.size() );
        assertFalse( myStack.empty() );
        assertFalse( myStack.isFull() );

        this.myStack.push("sascha");
        this.myStack.push("sascha123");

        // Abfrage Zustand
        assertEquals( 4 , myStack.size() );
        assertTrue( myStack.isFull() );

        // Exception, falls Stack schon voll und dennoch ein Objekt gepusht wird.
        assertThrows( IndexOutOfBoundsException.class , () -> { this.myStack.push("sascha"); } );
        assertEquals( 4 , myStack.size() );

        this.myStack.pop();
        assertFalse( myStack.isFull() );
        assertEquals( 3 , myStack.size() );

        this.myStack.pop();
        assertEquals( 2 , myStack.size() );

        this.myStack.pop();
        assertEquals( 1 , myStack.size() );

        this.myStack.pop();
        assertEquals( 0 , myStack.size() );

        assertTrue( myStack.empty() );

    }

}
