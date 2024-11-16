package Ex6_02;

class Rectangle implements GeometricObject{
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public String toString() {
        return "Ex6_01.Rectangle[width="+width+",length="+length+"]";
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter() {
        return (width+length)*2;
    }
}
