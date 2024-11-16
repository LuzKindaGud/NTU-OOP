package Ex4_03;

public class PointTest { public static void main(String[] args) {
    // Test Point2D
    Point2D point2D = new Point2D(1.0f, 2.0f);
    System.out.println("Point2D: " + point2D);
    System.out.println("X: " + point2D.getX());
    System.out.println("Y: " + point2D.getY());
    point2D.setX(3.0f);
    point2D.setY(4.0f);
    System.out.println("Updated Point2D: " + point2D);

    // Test Point3D
    Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
    System.out.println("\nPoint3D: " + point3D);
    System.out.println("X: " + point3D.getX());
    System.out.println("Y: " + point3D.getY());
    System.out.println("Z: " + point3D.getZ());
    point3D.setXYZ(4.0f, 5.0f, 6.0f);
    System.out.println("Updated Point3D: " + point3D);
}
}
