package org.hbrs.se1.ws24.demo.kapitel6;

public class ClientForBuchung {
    public static void main(String[] args) {
        BuchungDTO buchungDTO = new BuchungDTO("Alda", 2);
        System.out.println("Name der Person: " + buchungDTO.name());
        System.out.println(buchungDTO.toString());
    }
}
