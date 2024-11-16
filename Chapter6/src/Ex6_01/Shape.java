package Ex6_01;

abstract class Shape{
    protected String color = "red";
    protected boolean filled = true;

    public Shape(){
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled(){
        return filled;
    }

    public boolean getFilled() {
        return filled;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    public String toString(){
        return "Ex6_01.Shape[color="+color+",filled="+filled+"]";
    }
}
