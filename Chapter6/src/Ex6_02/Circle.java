package Ex6_02;

class Circle implements GeometricObject{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ex6_01.Circle[radius="+radius+"]";
    }

    public double getArea(){
        return Math.PI * radius *radius;
    }

    public double getPerimeter(){
        return Math.PI * radius * 2;
    }
}
