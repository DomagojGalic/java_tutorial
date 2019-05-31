package book.java.collections.basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Consumer;

public class PrimjerIteriranja3 {

    private static class Sumator implements Consumer<Integer> {
        private int suma;

        @Override
        public void accept(Integer t) {
            suma += t;
        }

        public int getSuma() {
            return suma;
        }
    }

    private static class Minimum implements Consumer<Integer> {
        boolean minimumVazeci = false;
        private int minimum;

        @Override
        public void accept(Integer t) {
            if (minimumVazeci) {
                minimum = t < minimum ? t : minimum;
            } else {
                minimum = t;
                minimumVazeci = true;
            }
        }

        public Optional<Integer> getMinimum() {
            if (minimumVazeci) {
                return Optional.of(minimum);
            } else {
                return Optional.empty();
            }
        }
    }

    public static void main(String[] args) {

        Collection<Integer> brojevi = Arrays.asList(1,2,3,4,5);

        Sumator sumator = new Sumator();
        brojevi.forEach(sumator);

        Minimum minimum = new Minimum();
        brojevi.forEach(minimum);

        System.out.println("Suma brojeva je: " + sumator.getSuma());

        Optional<Integer> minimalni = minimum.getMinimum();
        if (minimalni.isPresent()) {
            System.out.println("Minimalni broj je: " + minimalni.get());
        } else {
            System.out.println("Nema minimalnog broja.");
        }
    }
}