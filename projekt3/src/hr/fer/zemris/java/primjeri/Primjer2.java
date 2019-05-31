package hr.fer.zemris.java.primjeri;

import static hr.fer.zemris.java.primjeri.Matematika.kaoTekst;

/**
 * @author lala
 * @version 1.0
 */
public class Primjer2 {

    /**
     * Metoda u koju program ulazi
     * @param args Argumenti komandne linije
     */
    public static void main(String[] args) {
        System.out.println(kaoTekst('[', ']', 1, 4, 8.2, 13.1));
        System.out.println(kaoTekst('[', ']', 3.3));
        System.out.println(kaoTekst('[', ']'));

        System.out.println(kaoTekst(1, 4, 8.2, 13.1));

        System.out.println("Suma je: " + Matematika.suma(2, 4, 12));
    }
}