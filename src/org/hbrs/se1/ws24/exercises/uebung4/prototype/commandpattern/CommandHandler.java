package org.hbrs.se1.ws24.exercises.uebung4.prototype.commandpattern;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/*
 * Command Pattern (Kapitel 6)
 */
public class CommandHandler {

	public void startEingabe()  {

		// Vorbereitung
		// Verwendung einer HashMap - Speicherung von (key,value)-Paaren
		// Key: Command als String (z.B. "help")
		// Value: das zugehörige Command-Objekt (z.B. HelpCommand)
		HashMap< String , Command > commandsMap = new HashMap<String, Command>();
		commandsMap.put( "help" , new HelpCommand() );
		commandsMap.put( "enter" , new EnterCommand() );
		// weitere Befehle ... (erweiterbar!!)

		String strInput = null;

		// Initialisierung des Eingabe-View
		Scanner scanner = new Scanner( System.in );

		while ( true ) {
			// Print the prompt
			System.out.print("> ");

			// Naechster Befehl
			strInput = scanner.nextLine();

			// Extrahiert ein Array aus der Eingabe
			String[] strings = strInput.split(" ");
			String nextCommand = strings[0]; // das Commmando

			// KEINE IF-Anweisung oder Switch-Case-Statement mit N Zeilen
			// Anforderung: Auswahl des "Kommandos" in EINER Zeile

			Command command = commandsMap.get( nextCommand );
			command.execute(); // ggf. Fehlerhandling notwendig?!

			// Historie (ggf. eine Kopie / Clones eines Command-Objektes hinzufügen)
			Stack<Command> historie = new Stack<Command>();
			historie.push(command);

			// "undo" liegt als Befehl vor:
			historie.pop().undo();

		}

	}

}
