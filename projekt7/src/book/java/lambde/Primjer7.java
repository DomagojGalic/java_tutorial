package book.java.lambde;

public class Primjer7 {

    public static void main(String[] args) {

        IExtractor e1 = new IExtractor() {
            @Override
            public double extract(ComplexNumber z) {
                return z.getIm();
            }
        };

        IExtractor e2 = ComplexNumber::getRe;

        ComplexNumber z = new ComplexNumber(5, 1);
        System.out.println("Kompleksni broj: " + z);

        System.out.println("Imaginarni dio: " + e1.extract(z));

        System.out.println("Realni dio: " + e2.extract(z));
    }
}