public class Circle extends Shape{

 private double radius=1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter(){
        return Math.PI * 2*this.radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                super.toString()+
                ", radius=" + radius +
                "] ";
    }
}


