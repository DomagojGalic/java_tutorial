package hr.fer.zemris.java.tecaj_1;

/**
 * Razred sadrži funkcionalnost ispisa slučajno odabrane
 * poznate formule iz fizike na zaslon. Program trenutno
 * raspolaže s dvije formule iz područja relativističke
 * te Newtonove fizike; autori su , narano Einstein i
 * Newton.
 * 
 * @author lala
 * @version 1.0
 */
public class Formule {
    /**
     * Metoda posredstvom slučajnog mehanizma prilikom svakog
     * poziva temeljem uniformne distribucije odabire jednu od
     * formula s kojima raspolaže i ispisuje je na zaslon.
     * Ispisuje je i popratno zaglavlje.
     */
    public static void ispisiSlucajnuFormulu() {
        boolean prva = Math.random() < 0.5f;
        System.out.println("Jedna od najpoznatijih formula fizike:");
        System.out.println("======================================");
        if (prva) {
            System.out.println("    E = m * c^2");
        } else {
            System.out.println("    F = m * a");
        }
    }
}