package book.java.generics;

public class ParametriziranaZamjena {

    public static void main(String[] args) {
        Wrapper<Integer> prvi = new Wrapper<>(Integer.valueOf(5));
        Wrapper<Integer> drugi = new Wrapper<>(Integer.valueOf(8));

        obradi(prvi, drugi);

        System.out.println("Prvi: " + prvi + ", drugi: " + drugi);
    }

    public static void obradi(Wrapper<Integer> a, Wrapper<Integer> b) {
        if (Math.random() < .5) {
            a.setValue(a.getValue() + (int) (10 * Math.random()));
        } else {
            b.setValue(b.getValue() + (int) (10 * Math.random()));
        }
    }
}