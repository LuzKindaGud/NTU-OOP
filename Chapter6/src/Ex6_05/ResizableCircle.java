package Ex6_05;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "Resizable[radius=" + radius + "]";
    }

    @Override
    public void resize(int percent) {
        radius *= (1.0 * percent / 100);
    }
}