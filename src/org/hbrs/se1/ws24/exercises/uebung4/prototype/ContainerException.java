package org.hbrs.se1.ws24.exercises.uebung4.prototype;

public class ContainerException extends Exception {
	
	private String modus;
	private Integer id;
	
	public ContainerException( String s ) {
		super ( s );
	}

	/**
	 * Einfaches Exception-Handling. Orientierung an die Lösung Übungsaufgabe Nr. 3-2 besser...
	 */
	@Override
	public void printStackTrace() {
		if (this.id  != null) {
			System.out.println("Das Person-Objekt mit der ID " + this.id + " ist bereits vorhanden!");
		} else {
			System.out.println(this.getMessage());
		}
	} 

	public void addID(Integer id) {
		this.id = id;
	}


}
