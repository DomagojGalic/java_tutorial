package book.java.lambde;

public class Primjer3 {

    public static void main(String[] args) {

        double[] polje = new double[] {1,2,3,4,5,6,7,8,9,10};

        double[] transformirano = transformiraj(
            polje, new SinTransform()
        );
        double[] transformirano2 = transformiraj(
            polje, new CosTransform()
        );

        ispisi(polje, transformirano);
        ispisi(polje, transformirano2);
    }

    private static void ispisi(double[] arg, double[] f){
        for(int i = 0; i < arg.length; i++) {
            System.out.format("%f -> %f%n", arg[i], f[i]);
        }
    }

    public interface ITransform {
        double transform(double value);
    }

    // static klasa zato da nebi morali instancirat klasu Primjer3,
    // ugnježđena static klasa (kao član klase Primjer3)
    public static class SinTransform implements ITransform {

        @Override
        public double transform(double value) {
            return Math.sin(value); 
        }
    }

    public static class CosTransform implements ITransform {

        @Override
        public double transform(double value) {
            return Math.cos(value);
        }
    }

    public static double[] transformiraj(
            double[] polje, ITransform transformer) {
        if(polje == null) {
            throw new IllegalArgumentException(
                "Predana je nul referenca kao polje!"
            );
        }
        double[] rezultat = new double[polje.length];
        for(int i = 0; i < rezultat.length; i++) {
            double vrijednost = transformer.transform(polje[i]);
            rezultat[i] = vrijednost;
        }
        return rezultat;
    }
}