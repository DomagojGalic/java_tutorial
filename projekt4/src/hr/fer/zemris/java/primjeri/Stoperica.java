package hr.fer.zemris.java.primjeri;

import java.util.Date;

public class Stoperica {

    private Date datum;
    private long pocetniTrenutak;

    {
        datum = new Date();
    }

    {
        pocetniTrenutak = System.currentTimeMillis();
    }

    public long protekloVrijeme() {
        return System.currentTimeMillis() - pocetniTrenutak;
    }

    public static void main(String[] args) {
        Stoperica s = new Stoperica();
        double suma = 0.0;
        for(long l = 0; l < 1_000_000L; l++) {
            suma += Math.sin(0.1);
        }
        long trajanje = s.protekloVrijeme();

        System.out.println("Stoperica stvorena na: " + s.datum);
        System.out.println("Proteklo vrijeme u ms: " + trajanje);
        System.out.println("Rezultat je: " + suma);
    }
}