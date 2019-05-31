package book.java.lambde;

public class ComplexNumber {

    private double re;
    private double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(re);
        if(im < 0) {
            sb.append(" - i").append(-im);
        } else {
            sb.append(" + i").append(im);
        }
        return sb.toString();
    }
}