package hr.fer.zemris.java.primjeri;

import java.text.DecimalFormat;

/**
 * Program ilustrira formatirani ispis decimalnih
 * brojeva.
 * 
 * @author lala
 * @version 1.0
 */
public class FormatiraniIspisDecBrojeva {
    /**
     * Metoda na standardni izlaz ispisuje polje decimalnih
     * brojeva pram zadanom formatu.
     * 
     * @param polje polje decimalnih brojeva koje treba ispisati
     * @param format format koji govori kako polje treba ispisati
     * 
     * @see DecimalFormat
     */
    public static void ispis(double[] polje, String format) {
        DecimalFormat formatter = new DecimalFormat(
            format
        );
        for(int i = 0; i < polje.length; i++) {
            System.out.println(
                "(" + i + "): [" + formatter.format(polje[i]) + "]"
            );
        }
    }

    /**
     * Metoda koja se poziva prilikom pokretanja
     * programa. Argumenti su objašnjeni u nastavku.
     * 
     * @param args Argumenti komandne linije.
     */
    public static void main(String[] args) {
        double[] brojevi = new double[] {
            3.712, 55.816, 55.816, -4.18
        };

        ispis(brojevi, "000.00");
        System.out.println("------------");
        ispis(brojevi, "+00.00;-00.00");
    }
}