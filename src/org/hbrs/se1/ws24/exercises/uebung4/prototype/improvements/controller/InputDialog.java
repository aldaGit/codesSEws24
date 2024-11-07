package org.hbrs.se1.ws24.exercises.uebung4.prototype.improvements.controller;

import org.hbrs.se1.ws24.exercises.uebung4.prototype.improvements.model.Container;
import org.hbrs.se1.ws24.exercises.uebung4.prototype.improvements.model.ContainerException;
import org.hbrs.se1.ws24.exercises.uebung4.prototype.improvements.model.UserStory;
import org.hbrs.se1.ws24.exercises.uebung4.prototype.improvements.view.UserStoryView;

import java.util.Scanner;

public class InputDialog {

    private Container container = Container.getInstance();

    public InputDialog() {

    }

    /*
     * Diese Methode realisiert eine Eingabe ueber einen Scanner
     * Alle Exceptions werden an den aufrufenden Context (hier: main) weitergegeben (throws)
     * Das entlastet den Entwickler zur Entwicklungszeit und den Endanwender zur Laufzeit
     */
    public void startEingabe() throws ContainerException, Exception {
        String strInput = null;

        // Initialisierung des Eingabe-View
        Scanner scanner = new Scanner( System.in );

        // Ausgabe eines Texts zur Begruessung
        System.out.println("UserStory-Tool V1.1 by Julius P. (dedicated to all my friends from SE-1, who helped me to improve the tool!)");

        while ( true ) {
            System.out.print( "> "  );
            strInput = scanner.nextLine();

            // Extrahiert ein Array aus der Eingabe
            String[] strings = strInput.split(" ");

            // 	Falls 'help' eingegeben wurde, werden alle Befehle ausgedruckt
            if ( strings[0].equals("help") ) {
                System.out.println("Folgende Befehle stehen zur Verfuegung: help, dump....");
            }
            // Auswahl der bisher implementierten Befehle:
            String suchParameter = null;
            if ( strings[0].equals("dump") ) {
                try {
                    suchParameter = strings[1];

                } catch ( ArrayIndexOutOfBoundsException e) {
                    // we need exception handling!! 
                }
                UserStoryView view = new UserStoryView();
                view.startAusgabe( this.container.getCurrentList() , suchParameter );
            }
            // Auswahl der bisher implementierten Befehle:
            if ( strings[0].equals("enter") ) {
                // Daten einlesen ...
                // this.addUserStory( new UserStory( data ) ) um das Objekt in die Liste einzufügen.

                // Beispiel-Code einer UserStory, die intern abgelegt wird und auch persisten abgespeichert wird
                UserStory userStory = new UserStory();
                userStory.setId(22);
                userStory.setAufwand(5);
                userStory.setProject("Coll@HBRS");
                userStory.setTitel("Als Benutzer möchte ich mich einloggen, um mich zu authentifizieren.");

                this.container.addUserStory( userStory );
            }

            if (  strings[0].equals("store")  ) {
                this.container.store();
            }
        } // Ende der Schleife
    }
}
