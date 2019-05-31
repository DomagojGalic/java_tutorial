package hr.fer.zemris.java.tecaj_1;

/**
 * Klasa Pravokutnik koja implementira apstraktnu klasu
 * GeometrijskiLik
 * 
 * @author lala
 * @version 1.0
 */
public class Pravokutnik extends GeometrijskiLik {

    private int x;
    private int y;
    private int sirina;
    private int visina;

    /**
     * Konstruktor klase Pravokutnik
     * 
     * @param ime Ime pravokutnika
     * @param x Prva (x) koordinata gornjeg lijevog vrha
     * @param y Druga (y) koordinata gornjeg lijevog vrha
     * @param sirina Sirina pravokutnika, u x smjeru
     * @param visina Visina pravokutnika, u y smjeru
     */
    public Pravokutnik(String ime, int x, int y,
                       int sirina, int visina) {
        super(ime);
        this.x = x;
        this.y = y;
        this.sirina = sirina;
        this.visina = visina;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    public int getSirina() {
        return sirina;
    }

    public int getVisina() {
        return visina;
    }

    @Override
    public double getPovrsina() {
        return sirina * visina;
    } 

    @Override
    public double getOpseg() {
        return 2 * (sirina + visina);
    }

    @Override
    public boolean sadrziTocku(int x, int y) {
        if (x < this.x || x >= this.x + sirina) return false;
        if (y < this.y || y >= this.y + visina) return false;
        return true;
    }

    @Override
    public void crtaj(Slika slika) {
        if(x+sirina <= 0 || x >= slika.getSirina()) return;
        if(y+visina <= 0 || y >= slika.getVisina()) return;

        int odX = Math.max(x, 0);
        int odY = Math.max(y, 0);

        int doX = Math.min(x + sirina, slika.getSirina());
        int doY = Math.min(y + visina, slika.getVisina());
        
        for(int x = odX; x < doX; x++) {
            for(int y = odY; y < doY; y++) {
                slika.upaliElement(x, y);
            }
        }
    }
}