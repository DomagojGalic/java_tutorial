package hr.fer.zemris.java.tecaj_1;

/**
 * Program koji ilustrira razdvajanje koda u više razreda.
 * 
 * @author lala
 * @version 1.0
 */
public class Glavni {

    /**
     * Metoda od koje kreće izvođenje programa.
     * @param args argumenti komandne linije. Ne koristimo ih.
     */
    public statis void main(String[] args) {
        System.out.println();
        System.out.println("Pozdrav!");
        System.out.println();
        Formule.ispisiSlucajnuFormulu();
    }
}