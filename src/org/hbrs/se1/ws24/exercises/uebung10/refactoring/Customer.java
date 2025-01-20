package org.hbrs.se1.ws24.exercises.uebung10.refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	
	public int numberOfBookings = 0;
	
	public int numberOfCancellations = 0;
	
	private String n;
	
	private String date;
	
	private Vector<Booking> books = new Vector();
	
	public String getBookingsAndCancellations(){
		int i = 0;
		int j = 0;
		Enumeration<Booking> element = books.elements();
		while (element.hasMoreElements()){
			Booking xxx = element.nextElement();
			i++;
			if ( xxx.isCancelled() ){
				j++; 
			}
		}
		this.numberOfBookings = i;
		this.numberOfCancellations = j;
		String result = "Report für den Kunden: " + this.n + ": \n";
		result += "Sie haben " + i + " Buchungen (u.a. Fluege und Autos) und " + j + " Stornierungen";
		result += "Sie sind übrigens seit dem " + date + " Mitglied bei booking.com";
		return result;
	}

	public void addBooking(Booking b) {
		books.add(b);
	}

}
