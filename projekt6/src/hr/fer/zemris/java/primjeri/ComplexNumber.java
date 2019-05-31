package hr.fer.zemris.java.primjeri;

public class ComplexNumber {

    private double real;
    private double imaginary;
    private static int counter = 0;

    public ComplexNumber(double real, double imaginary) {
        super();
        this.real = real;
        this.imaginary = imaginary;
        counter++;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public int getCounter() {
        return counter;
        //return ComplexNumber.counter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(real);
        if(imaginary >= 0) {
            sb.append(" + i").append(imaginary);
        } else {
            sb.append(" - i").append(-imaginary);
        }
        return sb.toString();
    }

    public ComplexNumberInfo getInfo() {
        return new ComplexNumberInfo();
    }

    // statičke

    public static int current() {
        return counter;
        // return ComplexNumber.counter;
    }

    // ComplexNumberInfo klasa

    public class ComplexNumberInfo {

        private int counterSnapshot;

        public ComplexNumberInfo() {
            this.counterSnapshot = counter;
        }

        public int getCounterSnapshot() {
            return counterSnapshot;
        }

        public double calculateModule() {
            // Možemo koristit i samo real/imagenary jer ComplexNumberInfo prripada objektu klase ComplexNumber
            return Math.sqrt(
                Math.pow(ComplexNumber.this.real, 2)
                + Math.pow(ComplexNumber.this.imaginary, 2)
            );
        }

        public double getAngle() {
            return Math.atan2(
                ComplexNumber.this.imaginary,
                ComplexNumber.this.real
                );
        }
    }


}