package org.hbrs.se1.ws24.exercises.uebung10.refactoring;

public class Booking {

	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	private String duration;
	
	private boolean isCancelled;

	public boolean isCancelled() {
		return this.isCancelled;
	}
	
	public void setCancelled( boolean isC ){
		this.isCancelled = isC;
	}

	public BookingType mode;

	public void init( String mode , String flightTyp , String traintype ) {
		switch (mode) {
			case "Car":
				System.out.println("Handling Car mode");
				this.mode = new BookingType( mode);
				break;
			case "Hotel":
				System.out.println("Handling Hotel mode");
				this.mode = new BookingType( mode, null);
				break;
			case "Flight":
				System.out.println("Handling Flight mode");
				this.mode = new BookingType( mode , flightTyp );
				break;
			case "Train":
				System.out.println("Handling Train mode");
				this.mode = new BookingType( mode , null , traintype);
				break;
			default:
				System.out.println("Unknown mode");
				// Add logic for unknown mode
				break;
		}
	}
}
