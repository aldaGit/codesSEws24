package org.hbrs.se1.ws24.demo.kapitel6;

public class Client {

    private final EnglishTranslator englishTranslator = new EnglishTranslator();

    public void display() {
        translate("1");
    }

    public String translate(String number) {
        return englishTranslator.translate(number);
    }
}
