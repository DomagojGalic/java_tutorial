package book.java.generics;

public class PrimjerMetode {

    public static void main(String[] args) {
        Integer broj1 = 27;
        Integer broj2 = -13;
        String ime1 = "Pero";
        String ime2 = "Ivo";

        System.out.println(parniSazetak(broj1));
        System.out.println(parniSazetak(ime1));

        Integer broj3 = veciSazetak(broj1, broj2);
        String ime3 = veciSazetak(ime1, ime2);

        System.out.println(broj3);
        System.out.println(ime3);
    }

    public static <T> boolean parniSazetak(T objekt) {
        int sazetak = objekt.hashCode();
        return sazetak % 2 == 0;
    }

    public static <T> T veciSazetak(T o1, T o2) {
        int sazetak1 = o1.hashCode();
        int sazetak2 = o2.hashCode();
        return sazetak1 < sazetak2 ? o2 : o1;
    }
}