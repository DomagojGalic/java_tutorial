package book.java.collections.basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class PrimjerIteriranja {

    public static void main(String[] args) {

        Collection<Integer> brojevi = Arrays.asList(1,2,3,4,5);

        int suma = 0;

        Iterator<Integer> iter = brojevi.iterator();
        while(iter.hasNext()) {
            Integer n = iter.next();
            suma += n;
        }

        System.out.println("Suma brojeva je: " + suma);

        int novaSuma = 0;
        for (Integer broj : brojevi) {
            novaSuma += broj;
        }

        System.out.println("Nova suma brojeva je: " + novaSuma);
    }
}