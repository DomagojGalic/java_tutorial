package hr.fer.zemris.java.primjeri;

/**
 * @author lala
 * @version 1.0
 */
public class SumaReda {

    /**
     * Metoda koja se poziva prilikom pokretanja
     * programa. Argumenti su objasnjeni u nastavku.
     * 
     * @param args Argumenti komandne linije.
     */
    public static void main(String[] args) {

        if(args.length != 1) {
            System.err.println(
                "Program mora imati jedan argument!"
            );
            System.exit(1);
        }

        double broj = Double.parseDouble(args[0]);

        System.out.println("Računam sumu...");

        double suma = racunajSumu(broj);

        System.out.println("f(" + broj + ")=" + suma);
    }

    /**
     * Računa e^x razvojem u Taylorov red, prema formuli
     * e^x = 1+x+(x^2/(2!))+(x^3/(3!))+...
     * 
     * @param broj argument funkcije e^x
     * 
     * @return iznos funkcije u točki=broj dobiven kao
     *         suma prvih 10 članova Taylorov reda.
     */
    private static double racunajSumu(double broj) {

        final int redPolinoma = 10;
        double suma = (1 + broj/redPolinoma);

        for (int i = 0; i < redPolinoma; i++) {
            suma = 1 + (broj * suma)/(redPolinoma - i + 1);
        }

        suma += 1.0;

        return suma;
    }

}