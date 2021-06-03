public class Main {
    public static void main(String[] args ) {

        Shape []shapes = new Shape[10];
        for (int i=0; i<10; i++) {
            if(i%2 == 0 )     { shapes[i] = new Circle(2.0*(i+1)); }
            else if(i%3 == 0) { shapes[i] = new Rectangle(2.0*(i+1), 3); }
            else              { shapes[i] = new Square(2.0*(i+1)); }
        }

        for (int i =0; i<10; i++) {
            System.out.println(shapes[i] +
                    "\t\t area=  " + shapes[i].getArea() +
                    ",\t perimeter = " + shapes[i].getPerimeter() +
                    " ");
        }
    }
}
