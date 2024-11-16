package Ex6_01;

class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(){
        super();
    }

    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (width*length)*2;
    }

    public String toString() {
        return "Ex6_01.Rectangle[Ex6_01.Shape[color=" + color + ", filled=" + filled + "],width =" + width +",length="+length+ "]";
    }
}