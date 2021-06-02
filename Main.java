public class Main {

    public static void main(String[] args ) {

        Circle []circles = new Circle[10];
        for (int i=0; i<10; i++){
            circles[i] = new Circle(2.0*(i+1));
        }


        for (int i =0; i<10; i++) {
            System.out.println(circles[i] +
                    ",\t area=  " + circles[i].getArea() +
                    ",\t perimeter = " + circles[i].getPerimeter() +
                    " ");
        }

    }
}
