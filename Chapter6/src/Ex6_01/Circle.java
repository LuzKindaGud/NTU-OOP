package Ex6_01;

class Circle extends Shape{
    protected double radius = 1.0;

    public Circle(){
        super();
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return Math.PI*radius*2;
    }

    public String toString() {
        return "Ex6_01.Circle[radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
    }
}
