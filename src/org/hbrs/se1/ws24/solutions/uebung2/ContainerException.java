package org.hbrs.se1.ws24.solutions.uebung2;

/**
 * Checked Exception (always subclasses from class Exception)
 * Checked during compilation, must be caught in the calling client class
 * In comparision: unchecked exception (subclass of RuntimeException) do not need to be catched
 * In Theorie (and Praxis): Checked: Error by user (e.g. wrong input).
 * Unchecked: Error by programmer (e.g. Null-Pointer)
 * Best practice: always catch exceptions for a stable system!
 * Good documentation:
 * https://www.baeldung.com/java-checked-unchecked-exceptions
 *
 */
public class ContainerException extends Exception {

	private Integer id;

	public ContainerException(  String id  ) {
		super ("Das Member-Objekt mit der ID " + id + " ist bereits vorhanden!");
	}

	public ContainerException( ) {
		super ("NULL-Werte dürfen nicht aufgenommen werden!");
	}

}
