package book.java.lambde;

public class Primjer5 {

    public static void main(String[] args) {

        double[] polje = new double[] {1,2,3,4,5,6,7,8,9,10};

        double[] transformiraniSin = transformiraj(polje,
            (double value) -> {return Math.sin(value);}
        );
        double[] transformiraniCos = transformiraj(polje,
            (value) -> Math.cos(value)
        );
        double[] transformiraniCust = transformiraj(polje,
            value -> 2 * value - 4
        );

        ispisi(polje, transformiraniSin);
        ispisi(polje, transformiraniCos);
        ispisi(polje, transformiraniCust);

    }

    private static interface ITransform {

        public double transform(double value);
    }

    private static double[] transformiraj(double[] polje,
            ITransform transformator) {
        if(polje == null) {
            throw new IllegalArgumentException(
                "Predana nul referenca kao polje!"
            );
        }
        double[] rezultat = new double[polje.length];
        for(int i = 0; i < polje.length; i++) {
            rezultat[i] = transformator.transform(polje[i]);
        }
        return rezultat;
    }

    private static void ispisi(double[] arg, double[] f) {
        for(int i = 0; i < arg.length; i++) {
            System.out.format("%f -> %f%n", arg[i], f[i]);
        }
        System.out.println();
    }
}