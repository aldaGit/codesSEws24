package org.hbrs.se1.ws24.exercises.uebung10.refactoring;

public class BookingService {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BookingService service = new BookingService();
	}

	public void getInfoAboutCustomer( Customer c ){
		c.getBookingsAndCancellations( );
		
		if (c.numberOfCancellations > 30 ) {
			System.out.println("Problematischer Kunde da zu viele Stornierungen!");
			c.numberOfCancellations = 0;
			System.out.println("... nun nicht mehr");
		}
	}

	public void addBooking( Customer c, Booking b ) {
		c.addBooking( b );
	}

}
