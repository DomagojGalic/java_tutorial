package book.java.lambde;

public class Primjer8 {

    public static void main(String[] args) {
        
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(1, 1, 1);

        System.out.println("Vektori:");
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println();

        //koristeći nestatičku metodu
        System.out.println("Koristeći nestatičke metode:");
        IVectorOp vop1 = new IVectorOp() {
            @Override
            public Vector3D operate(Vector3D first, Vector3D second) {
                return first.add(second);
            }
        };
        System.out.println("vop1: v1 + v2 = " + vop1.operate(v1, v2));

        IVectorOp vop2 = (f, s) -> f.add(s);
        System.out.println("vop2: v1 + v2 = " + vop2.operate(v1, v2));

        IVectorOp vop3 = Vector3D::add;
        System.out.println("vop3: v1 + v2 = " + vop3.operate(v1, v2));

        System.out.println();

        //koristeći statičku metodu
        System.out.println("Koristeći statičke metode:");
        IVectorOp vop4 = new IVectorOp() {
            @Override
            public Vector3D operate(Vector3D first, Vector3D second) {
                return Vector3D.sum(first, second);
            }
        };
        System.out.println("vop4: v1 + v2 = " + vop4.operate(v1, v2));

        IVectorOp vop5 = (f, s) -> Vector3D.sum(f, s);
        System.out.println("vop5: v1 + v2 = " + vop5.operate(v1, v2));

        IVectorOp vop6 = Vector3D::sum;
        System.out.println("vop6: v1 + v2 = " + vop6.operate(v1, v2));
    }
}