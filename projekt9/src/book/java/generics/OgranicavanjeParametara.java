package book.java.generics;

public class OgranicavanjeParametara {

    public static void main(String[] args) {
        Number n1 = veci(Integer.valueOf(2), Integer.valueOf(5));
        Integer n2 = veci(Integer.valueOf(2), Integer.valueOf(5));

        Number n3 = veci(Integer.valueOf(2), Long.valueOf(5));

        System.out.format("n1 %d\nn2 %d\nn3 %d\n", n1, n2, n3);
    }

    public static <T extends Number> T veci(T n1, T n2) {
        return n1.doubleValue() < n2.doubleValue() ? n2 : n1;
    }
}