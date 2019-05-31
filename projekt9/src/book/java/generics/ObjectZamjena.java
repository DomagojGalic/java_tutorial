package book.java.generics;

public class ObjectZamjena {

    public static void main(String[] args) {

        ObjectWrapper prva = new ObjectWrapper(Integer.valueOf(5));
        ObjectWrapper druga = new ObjectWrapper(Integer.valueOf(8));

        obradi(prva, druga);

        System.out.format("Prva %d, druga %d%n", prva.getValue(), druga.getValue());

        System.out.println("Prva: " + prva + ", druga: " + druga);
    }

    public static void obradi(ObjectWrapper a, ObjectWrapper b) {
        if (Math.random() < .5) {
            a.setValue(
                (Integer) a.getValue() + (int) (10 * Math.random())
            );
        } else {
            b.setValue(
                (Integer) b.getValue() + (int) (10 * Math.random())
            );
        }
    }
}