package hr.fer.zemris.java.primjeri;

public class RazredB extends RazredA {

    {
        System.out.println("B: prvi blok");
    }

    public RazredB() {
        System.out.println("B: konstruktor");
    }

    {
        System.out.println("B: drugi blok");
    }
}