package hr.fer.zemris.java.tecaj_1;

/**
 * Definiramo klasu Krug koja implementira
 * klasu GeometrijskiLik
 * 
 * @author lala
 * @version 1.0
 */
public class Krug extends GeometrijskiLik {

    private int cx;
    private int cy;
    private int r;

    /**
     * Konstruktor klase Krug
     * 
     * @param ime Ime geometrijskog lika
     * @param cx Prva (x) koordinata središta
     * @param cy Druga (y) koordinata središta
     * @param r Radijus kruga
     */
    public Krug(String ime, int cx, int cy, int r) {
        super(ime);
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    public int getCx() {
        return cx;
    }

    public int getCy() {
        return cy;
    }

    public int getR() {
        return r;
    }

    @Override
    public double getOpseg() {
        return 2 * r * Math.PI;
    }

    @Override
    public double getPovrsina() {
        return r * r * Math.PI;
    }

    @Override
    public boolean sadrziTocku(int x, int y) {
        int dx = cx - x;
        int dy = cy - y;
        return dx*dx + dy*dy <= r*r;
    }
}