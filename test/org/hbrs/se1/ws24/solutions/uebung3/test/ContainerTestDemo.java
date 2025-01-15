package org.hbrs.se1.ws24.solutions.uebung3.test;

import org.hbrs.se1.ws24.solutions.uebung3.Container;
import org.hbrs.se1.ws24.solutions.uebung3.ContainerException;
import org.hbrs.se1.ws24.solutions.uebung3.Member;
import org.hbrs.se1.ws24.solutions.uebung3.MemberKonkret;
import org.hbrs.se1.ws24.solutions.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws24.solutions.uebung3.persistence.PersistenceStrategyMongoDB;
import org.hbrs.se1.ws24.solutions.uebung3.persistence.PersistenceStrategyStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ContainerTestDemo {

    private Container container;

    @BeforeEach
    void setUp() {
        container = Container.getInstance();
    }

    @Test
    void testNoStrategeySet() {

    }

    @Test
    void testMongoDBNotImplementedOldFashioned() {

    }

    @Test
    void testMongoDBNotImplementedHipSolution() {
        container.setPersistenceStrategie( new PersistenceStrategyMongoDB<Member>() );
        assertThrows( PersistenceException.class , () -> container.store() );

    }

    @Test
    void testWrongLocationOfFile() {
        try {
            PersistenceStrategyStream<Member> strat = new PersistenceStrategyStream<Member>();

            // FileStreams do not like directories, so try this out ;-)
            strat.setLOCATION("/Users/saschaalda/tmp");
            container.setPersistenceStrategie( strat );
            container.store();

        } catch (PersistenceException e) {
            System.out.println("Message: " + e.getMessage() );
            assertEquals( e.getMessage() , "Error in opening the connection, File could not be found" );
            //ToDo: Exception Type
        }
    }

    @Test
    void testStoreDeleteAndLoad() {
        try {
            container.setPersistenceStrategie( new PersistenceStrategyStream<Member>() );
            container.addMember(new MemberKonkret(1));

            // ToDo: size
            container.store();

            container.deleteMember(1);
            // ToDo: Size


            container.load();
            // ToDo: size
            System.out.println(container.size());
            assertEquals(1, container.size());

        } catch (PersistenceException | ContainerException e) {
            System.out.println("Message: " + e.getMessage() );
        }
    }

}