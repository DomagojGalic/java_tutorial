package hr.fer.zemris.java.tecaj_1.primjeri;

import hr.fer.zemris.java.tecaj_1.GeometrijskiLik;
import hr.fer.zemris.java.tecaj_1.Pravokutnik;

/**
 * Primjer korištenja klase pravokutnik
 */
public class Program2 {

    public static void main(String[] args) {
        GeometrijskiLik lik1 = new Pravokutnik("Prvi", 5, 5, 10, 10);
        GeometrijskiLik lik2 = new Pravokutnik("Drugi", 1, 1, 4, 4);

        System.out.format(
            "Površina pravokutnika %s je %.1f.\n",
            lik1.getIme(), lik1.getPovrsina());
        System.out.format(
            "Opseg pravokutnika %s je %.1f.\n",
            lik2.getIme(), lik2.getOpseg());
    }
}