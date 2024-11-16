package Ex5_02;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double radius, double height, String color) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return base.getColor();
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    public double getArea() {
        double baseArea = base.getArea();
        double sideSurfaceArea = 2 * Math.PI * base.getRadius() * height;
        return 2 * baseArea + sideSurfaceArea;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public String toString() {
        return "Cylinder[radius=" + base.getRadius() + ",height=" + height + ",color=" + base.getColor() + "]";
    }
}
