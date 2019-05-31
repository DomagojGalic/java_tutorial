package book.java.lambde;

public class Vector3D {

    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector3D add(Vector3D other) {
        double sx = this.x + other.getX();
        double sy = this.y + other.getY();
        double sz = this.z + other.getZ();

        return new Vector3D(sx, sy, sz);
    }

    public static Vector3D sum(Vector3D v1, Vector3D v2) {
        return v1.add(v2);
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}