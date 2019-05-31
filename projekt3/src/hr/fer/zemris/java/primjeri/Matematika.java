package hr.fer.zemris.java.primjeri;

/**
 * Ilustracija funkcija s varijablinim brojem argumenata.
 * @author lala
 * @version 1.0
 */
public class Matematika {

    /**
     * Metoda prima 0 ili više cijelih brojeva i vraća njihovu
     * sumu.
     * 
     * @param brojevi 0 ili više cijelih brojeva
     * @return suma
     */
    public static int suma(int ... brojevi) {
        int s = 0;
        for(int broj : brojevi) {
            s += broj;
        }
        return s;
    }

    /**
     * Metoda predani niz projeva pretvara u string. String
     * započinje lijevim simbolim, slijedi poredani brojevi
     * koji su razdvojeni zarezima i završava desnim simbolim.
     * 
     * @param lijeviSimbol simbol s kojim mora započeti string
     * @param desniSimbol simbol s kojim mora završiti string
     * @param brojevi niz brojeva koje treba pretvoriti u string
     * @return string koji predstavlja predani niz brojeva
     */
    public static String kaoTekst(char lijeviSimbol,
                        char desniSimbol, double ... brojevi){
        StringBuilder sb = new StringBuilder();
        sb.append(lijeviSimbol);
        boolean prvi = true;
        for(double broj : brojevi) {
            if (prvi) {
                prvi = false;
            } else {
                sb.append(", ");
            }
            sb.append(broj);
        }
        sb.append(desniSimbol);
        return sb.toString();
    }

    /**
     * Metoda predani niz brojeva pretvara u string. String
     * započinje znakom '{' slijede poredani brojevi koji su
     * razdvojeni zarezima i završava znakom '}'.
     */
    public static String kaoTekst(double ... brojevi) {
        return kaoTekst('{', '}', brojevi);
    }
}