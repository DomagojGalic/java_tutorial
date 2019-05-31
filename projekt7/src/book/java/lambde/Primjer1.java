package book.java.lambde;

public class Primjer1 {

    public static void main(String[] args) {
        double[] polje = new double[] {1,2,3,4,5,6,7,8,9,10};
    
        double[] transformirano = transformiraj(polje);

        ispisi(polje, transformirano);
    }

    private static void ispisi(double[] arg, double[] f) {
        for(int i = 0; i < arg.length; i++) {
            System.out.format("%f -> %f%n", arg[i], f[i]);
        }
    }

    private static double[] transformiraj(double[] polje) {
        if(polje == null) {
            throw new IllegalArgumentException(
            "Predana je nul referenca kao polje!"
            );
        }
        double[] rezultat = new double[polje.length];
        for(int i = 0; i < rezultat.length; i++) {
            double vrijednost = Math.sin(polje[i]);
            rezultat[i] = vrijednost;
        }
        return rezultat;
    }
}