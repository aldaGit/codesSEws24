package org.hbrs.se1.ws24.exercises.uebung10.refactoring;

public class BookingType {

    private String traintype;
    private String flightTyp = null;
    private String mode;

    BookingType(String mode, String flightTyp) {
        this.mode = mode;
        this.flightTyp = flightTyp;
    }

    BookingType(String mode) {
        this.mode = mode;
    }

    public BookingType(String mode, Object o, String traintype) {
        this.mode = mode;
        this.traintype = traintype;
    }

    public String getMode() {
        return mode;
    }
}
