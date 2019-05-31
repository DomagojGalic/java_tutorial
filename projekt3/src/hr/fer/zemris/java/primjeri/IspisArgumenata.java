package hr.fer.zemris.java.primjeri;

/**
 * Program ispisuje argumente koje prima putem naredbenog
 * retka.
 * 
 * @author lala
 * @version 1.0
 */
public class IspisArgumenata {

    /**
     * Metoda koja se poziva prilikom pokretanja
     * programa. Argumenti su objasnjeni u nastavku.
     * 
     * @param args Argumenti komandne linije.
     */
    public static void main(String[] args) {

        int brojArgumenata = args.length;

        for(int i = 0; i < brojArgumenata; i++) {
            System.out.println(
                "Argument " + (i+1) + " : " + args[i]
            );
        }
    }
}