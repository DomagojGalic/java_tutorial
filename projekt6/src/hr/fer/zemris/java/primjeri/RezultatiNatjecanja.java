package hr.fer.zemris.java.primjeri;

import java.util.Arrays;

public class RezultatiNatjecanja {

    private String[] timovi;
    private double[] vremena;

    public RezultatiNatjecanja(String[] timovi, double[] vremena) {
        super();
        this.timovi = Arrays.copyOf(timovi, timovi.length);
        this.vremena = Arrays.copyOf(vremena, vremena.length);
    }

    public void ispisiSortirano(final boolean velikimSlovima) {
        class Par {
            String ime;
            double vrijeme;

            public Par(String ime, double vrijeme) {
                super();
                this.ime = velikimSlovima ? ime.toUpperCase() : ime;
                this.vrijeme = vrijeme;
            }

            @Override
            public String toString() {
                return ime + ": " + vrijeme + "s";
            }
        }

        Par[] parovi = new Par[timovi.length];
        for(int i = 0; i < parovi.length; i++) {
            parovi[i] = new Par(timovi[i], vremena[i]);
        }

        for(int i = 0; i < parovi.length; i++) {
            for(int j = i+1; j < parovi.length; j++) {
                if(parovi[i].vrijeme > parovi[j].vrijeme) {
                    Par tmp = parovi[i];
                    parovi[i] = parovi[j];
                    parovi[j] = tmp;
                }
            }
        }

        for(Par p : parovi) {
            System.out.println(p);
        }
    }
}