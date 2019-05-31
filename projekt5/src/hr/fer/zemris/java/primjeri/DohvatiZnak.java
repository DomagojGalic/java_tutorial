package hr.fer.zemris.java.primjeri;

import java.io.IOException;

public class DohvatiZnak {

    public static void main(String[] args) throws IOException {
        dohvatiZnak();
    }

    private static char dohvatiZnak() throws IOException {
        if (Math.random() < 0.1) {
            throw new IOException(
                "Pogreška kod generiranja znaka"
            );
        } else {
            return 'A';
        }
    }
}