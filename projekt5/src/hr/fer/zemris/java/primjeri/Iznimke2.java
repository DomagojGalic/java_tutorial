package hr.fer.zemris.java.primjeri;

public class Iznimke2 {

    public static void main(String[] args) {
        obrada();
    }

    private static void obrada() {
        int broj = (int)(Math.random()*300 + 0.5) % 3;
        switch(broj) {
            case 0: obrada1(); break;
            case 1: obrada2(null); break;
            case 2: obrada3(Integer.valueOf(5)); break;
        }
    }

    private static void obrada1() {
        int[] polje = new int[2];
        polje[3] = 17;
    }

    private static void obrada2(Object o) {
        String s = o.toString();
        System.out.println(s);
    }

    private static void obrada3(Object o) {
        Double d = (Double)o;
        System.out.println(d.doubleValue()+1);
    }
}