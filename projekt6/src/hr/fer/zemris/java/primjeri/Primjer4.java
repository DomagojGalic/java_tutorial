package hr.fer.zemris.java.primjeri;

public class Primjer4 {

    public static void main(String[] args) {
        String[] timovi = {
            "Tim 1", "Tim 2", "Tim 3", "Tim 4"
        };
        double[] vremena = {
            38.2, 37.1, 39.1, 38.5
        };

        RezultatiNatjecanja rez = new RezultatiNatjecanja(
            timovi, vremena
        );
        rez.ispisiSortirano(true);
    }
}