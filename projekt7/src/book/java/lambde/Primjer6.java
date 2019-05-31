package book.java.lambde;

public class Primjer6 {

    public static void main(String[] args) {

        ITransform tr1 = new ITransform() {
            @Override
            public double transform(double value) {
                return Funkcije.sinus(value);
            }
        };
        System.out.println(tr1.transform(10));

        ITransform tr2 = (double value) -> Funkcije.cosinus(value);
        System.out.println(tr2.transform(10));

        ITransform tr3 = Funkcije::squareRoot;
        System.out.println(tr3.transform(9));
    }

    private static interface ITransform {

        public double transform(double value);
    }
}