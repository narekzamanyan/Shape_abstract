public abstract class Shape {
    private String color="red";
    private boolean filled=true;


    public Shape(){
    }

    public Shape( String color, boolean filled ){
       this.filled= filled;
       this.color=color;
    }


    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();


    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}


