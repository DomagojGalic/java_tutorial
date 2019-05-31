package hr.fer.zemris.principles.srp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IspisIzvjestaja {

    private Student[] zapisi;
    private SimpleDateFormat sdf;

    public void ispis() {
        sdf = new SimpleDateFormat(odrediFormatDatuma());
        zapisi = dohvatiZapise();
        ispisiZaglavlje();
        ispisiSeparator();
        ispisiZapise();
        ispisiSeparator();
        ispisiKraj();
    }

    private String odrediFormatDatuma() {
        return "yyyy-MM-dd HH:mm";
    }

    private Student[] dohvatiZapise() {
        return Zapisi.svi;
    }

    private void ispisiZaglavlje() {
        System.out.println("Izvjestaj ocjena na kolegiju");
        System.out.println("Ipsisano: " + sdf.format(new Date()));
    }

    private void ispisiSeparator() {
        System.out.println("------------------------------------");
    }

    private void ispisiZapise() {
        for(Student s : zapisi) {
            ispisiZapis(s);
        }
    }

    private void ispisiZapis() {
        System.out.format(
            "Student: %s %s %s\n",
            s.getJMBAG(), s.getPrezime(), s.getIme()
        );
        System.out.println("    Ocjena: " + s.getOcjena());
    }

    private void ispisiKraj() {
        System.out.println(
            "Ukupno ispisano zapisa: " + zapisi.length
        );
    }
}