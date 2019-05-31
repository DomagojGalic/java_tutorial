package book.java.lambde;

public class Primjer4 {

    public static void main(String[] args) {

        double[] polje = new double[] {1,2,3,4,5,6,7,8,9,10};

        double[] transformirano = transformiraj(
            polje, new CosTransform()
        );
        double[] transformirano2 = transformiraj(
            polje, new SinTransform()
        );
        double[] transformirano3 = transformiraj(
            polje, new ITransform() {
                @Override
                public double transform(double value) {
                    return 2 * value - 4;
                }
            }
        );

        ispisi(polje, transformirano);
        ispisi(polje, transformirano2);
        ispisi(polje, transformirano3);
    }

    private static interface ITransform {

        public double transform(double value);
    }

    private static class SinTransform implements ITransform {

        @Override
        public double transform(double value) {
            return Math.sin(value);
        }
    }

    private static class CosTransform implements ITransform {

        @Override
        public double transform(double value) {
            return Math.cos(value);
        }
    }

    private static double[] transformiraj(double[] polje,
            ITransform transformer) {
        if(polje == null) {
            throw new IllegalArgumentException(
                "Predana je nul referenca kao polje!"
            );
        }
        double[] rezultat = new double[polje.length];
        for(int i = 0; i < polje.length; i++) {
            rezultat[i] = transformer.transform(polje[i]);
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