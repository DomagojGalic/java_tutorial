package hr.fer.zemris.java.tecaj_1;

public class DemonstracijaParnihBrojeva {

    public static void main(String[] args) {
        ParniBrojevi pb = new ParniBrojevi(2, 5);

        Ispisivac.ispisi("Obilazak prvi puta:", pb);

        Ispisivac.ispisi("Obilazak drugi puta:", pb);
    }

    private static class Ispisivac {

        public static void ispisi(String poruka,
                Iterable<Integer> spremnik) {
            
            System.out.println(poruka);
            System.out.println("========================");
            
            for(Integer broj : spremnik) {
                System.out.println(broj);
            }
            System.out.println();
        }
    }
}