package org.hbrs.se1.ws24.demo.vererbung;

public class ExtendedClass extends BaseClass {

    public void singlemethod() {
        this.readSomething();
        this.writeSomething();
        this.doSomething();
    }

    public static void main(String[] args) {
        ExtendedClass extendedClass = new ExtendedClass();
        extendedClass.singlemethod();
        extendedClass.readSomething();
        extendedClass.writeSomething();
    }

    @Override
    /**
     * Override and Replacement of method readSomething
     */
    public void readSomething() {
        super.readSomething();
    }
}
