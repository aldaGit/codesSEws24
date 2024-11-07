package org.hbrs.se1.ws24.exercises.uebung4.prototype.improvements.controller;

import org.hbrs.se1.ws24.exercises.uebung4.prototype.improvements.model.Container;

public class Main {

	 /** Start-Methoden zum Starten des Programms
	 * (hier koennen ggf. weitere Initialisierungsarbeiten gemacht werden spaeter)
      */
    public static void main (String[] args) throws Exception {
        Container con = Container.getInstance();
        InputDialog dialog = new InputDialog();
        dialog.startEingabe();
    }
}
