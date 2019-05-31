package book.java.generics;

public class Zamjena {

    public static void main(String[] args) {
        IntWrapper prva = new IntWrapper(5);
        IntWrapper druga = new IntWrapper(8);

        obradi(prva, druga);

        System.out.format("Prva: %d, druga: %d%n",
        prva.getValue(), druga.getValue());
    }

    private static void obradi(IntWrapper prva, IntWrapper druga) {
        if (Math.random() < .5) {
            prva.setValue(prva.getValue() + (int) (10 * Math.random()));
        } else {
            druga.setValue(druga.getValue() + (int) (10 * Math.random()));
        }
    }
}