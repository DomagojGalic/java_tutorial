package book.java.lambde;

@FunctionalInterface
public interface IVectorOp {
    Vector3D operate(Vector3D first, Vector3D second);
}