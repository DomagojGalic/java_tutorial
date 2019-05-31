package book.java.generics;

public class Primjeri {

    public static void main(String[] args) {
        KeyValue<Integer, Integer> kvadrat = new Square(4);
        System.out.format(
            "%d^2 = %d%n",
            kvadrat.getKey(),
            kvadrat.getValue()
        );

        KeyValue<Integer, String> posta =
        new Pair<>(10000, "Zagreb");
        KeyValue<String, String> suprug =
        new Pair<>("Jasna", "Ivo");

        System.out.println(
            "Poštanski broj: "
            + posta.getKey()
            + ", grad: "
            + posta.getValue()
        );

        System.out.println(
            suprug.getValue()
            + " je muž "
            + suprug.getKey()
        );
    }
}