package org.hbrs.se1.ws24.solutions.uebung3;

import org.hbrs.se1.ws24.solutions.uebung3.persistence.*;

import java.util.List;

public class Client {

    public void startClient() {
        // Abholung der Referenz des Container-Objekts (Singleton!)
        Container container = Container.getInstance();

        // Hinzufügen von Member-Objekt
        try {
            container.addMember(new MemberKonkret(2));
        } catch (ContainerException e) {
            e.printStackTrace();
        }

        // Abspeichern veranlassen (Strategy muss hier nicht gesetzt werden!)
        try {
            container.store();
        } catch (PersistenceException e) {
           e.printStackTrace();
        }

        // Aktuelle Liste beziehen aus dem Container
        List<Member> liste = container.getCurrentList();

        // MemberView erzeugen und Liste übergeben
        MemberView view = new MemberView();
        view.dump( liste );

        // Liste wieder einladen
        try {
            container.load();
            // container.store();
        } catch (PersistenceException e) {
            e.printStackTrace();
        }

        // Aktuelle Liste beziehen aus dem Container
        liste = container.getCurrentList();

        // MemberView erzeugen und Liste übergeben
        view = new MemberView();
        view.dump( liste );

    }


}
