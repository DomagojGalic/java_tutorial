package hr.fer.zemris.java.primjeri;

public class Primjer5 {

    public static void main(String[] args) {

        Ispisivac.ispisi(new Poruka("Pozdrav!"));

        Ispisivac.ispisi(new IIspisivo() {
            @Override
            public String poruka() {
                return "Broj dostupnih poresora: "
                    + Runtime.getRuntime().availableProcessors();
            }
        });

        Ispisivac.ispisi(new DatumIVrijeme("yyyy-MM-dd HH:mm:ss"));

        Ispisivac.ispisi(new DatumIVrijeme("yyyy-MM-dd HH:mm:ss") {
            @Override
            public String poruka() {
                return super.poruka() + ", dretva: "
                    + Thread.currentThread().getName(); 
            }
        });
    }

    private static class Poruka implements IIspisivo {
        private String poruka;

        public Poruka(String poruka) {
            super();
            this.poruka = poruka;
        }

        @Override
        public String poruka() {
            return poruka;
        }
    }
}