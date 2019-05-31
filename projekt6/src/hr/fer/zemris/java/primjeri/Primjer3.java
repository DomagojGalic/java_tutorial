package hr.fer.zemris.java.primjeri;

import hr.fer.zemris.java.primjeri.ComplexNumber.ComplexNumberInfo;

public class Primjer3 {

    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, 3);
        ComplexNumberInfo z1Info = z1.getInfo();
        ComplexNumber z2 = new ComplexNumber(1, -2);
        ComplexNumberInfo z2Info = z2.getInfo();
        ComplexNumber z3 = new ComplexNumber(0, 4);
        // dajemo kontekst operatoru new kakao bi mogao dohvatiti referencu (this) na objekt z3 -> budući je ComplexNumberInfo unutarnja klasa klase ComplexNumber
        ComplexNumberInfo z3Info = z3.new ComplexNumberInfo();
    
        System.out.println(z1 + ", brojac = " + z1.getCounter());
        System.out.println(
            " ==> Brojač je: " + z1Info.getCounterSnapshot()
            );
        System.out.println(z2 + ", brojac = " + z2.getCounter());
        System.out.println(
            " ==> Brojač je: " + z2Info.getCounterSnapshot()
            );
        System.out.println(z3 + ", brojac = " + z3.getCounter());
        System.out.println(
            " ==> Brojač je: " + z3Info.getCounterSnapshot()
            );
        System.out.println(
            "Trenutno je kreirano " + ComplexNumber.current()
            + " objekata"
            );
        System.out.println(
            "Kut je: " + z3Info.getAngle() / Math.PI*180
            );
    }
}