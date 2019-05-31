package hr.fer.zemris.java.tecaj_1;

import java.util.Iterator;

public class ParniBrojevi implements Iterable<Integer> {

    private int prvi;
    private int n;

    public ParniBrojevi(int prvi, int n) {
        if(prvi % 2 != 0) {
            throw new IllegalArgumentException(
                "Broj " + prvi + " nije paran!"
            );
        }
        if(n < 0) {
            throw new IllegalArgumentException(
                "Broj brojeva je negativan" + "(" + n + ")!"
            );
        }
        this.prvi = prvi;
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IteratorBrojeva();
    }

    private class IteratorBrojeva implements Iterator<Integer> {
        
        private int trenutni;
        private int preostaliBrojevi;

        public IteratorBrojeva() {
            this.preostaliBrojevi = n;
            this.trenutni = prvi;
        }

        @Override
        public boolean hasNext() {
            return preostaliBrojevi>0;
        }

        @Override
        public Integer next() {
            if(preostaliBrojevi<1) {
                throw new RuntimeException("Nema više elemenata!");
            }
            int vrijednost = trenutni;
            trenutni += 2;
            preostaliBrojevi--;
            return vrijednost;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException(
                "Brisanje parnih brojeva nije moguće!"
            );
        }
    }
}