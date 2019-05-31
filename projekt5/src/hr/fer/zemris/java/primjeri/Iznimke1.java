package hr.fer.zemris.java.primjeri;

import java.util.Scanner;

public class Iznimke1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Unesite a, b i c: ");
            double a = s.nextDouble();
            double b = s.nextDouble();
            double c = s.nextDouble();
            try {
                System.out.println("Korjen je: " + solve(a, b, c));
            } catch(IllegalArgumentException ex) {
                System.out.println(
                    "Unijeli ste elemente uz koje ne postoje realni"
                    + " korjeni"
                    );
            }
            System.out.print("Ako želite novi unos, upišite DA.  ");
            if(!"DA".equals(s.next())) {
                break;
            }
        }
        s.close();
    }

    public static double solve(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if(d < 0) {
            throw new IllegalArgumentException(
                "Kvadratna jednadžba nema realnih korjena."
                );
        }
        return (-b + Math.sqrt(d)) / (2 * a);
    }
}