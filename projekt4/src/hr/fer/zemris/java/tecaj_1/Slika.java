package hr.fer.zemris.java.tecaj_1;

/**
 * Klasa Slika koja modelira prikaz slike na ekranu
 * sa opcijama paljenja i gašenja piksela te ispisom
 * slike u obliku stringa.
 * 
 * @author lala
 * @version 1.0
 */
public class Slika {

    private int sirina;
    private int visina;
    private boolean[][] elementi;

    public Slika(int sirina, int visina) {
        
        this.sirina = sirina;
        this.visina = visina;
        elementi = new boolean[visina][sirina]; //gledamo ga kao matricu
        //this.elementi = elementi; -> nije potrebno, jer smo ovdje nazvali varijablu elementi
    }

    public int getSirina() {
        return sirina;
    }

    public int getVisina() {
        return visina;
    }

    public void upaliElement(int x, int y) {
        elementi[y][x] = true;
    }

    public void ugasiElement(int x, int y) {
        elementi[y][x] = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((sirina+1)*visina);
        for(int y = 0; y < visina; y++) {
            for(int x = 0; x < sirina; x++) {
                sb.append(elementi[y][x] ? '*' : '.');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}