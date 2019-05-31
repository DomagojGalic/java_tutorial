package hr.fer.zemris.java.primjeri;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatumIVrijeme implements IIspisivo {

    private String format;

    public DatumIVrijeme(String format) {
        this.format = format;
    }

    @Override
    public String poruka() {
        return new SimpleDateFormat(format).format(new Date());
    }
}