//write a java code to create class name shape.create a object of shape and calculate the area and perimeter of the shape

public class Shape {

    int l;
    int b;
    static int count = 0;

    public Shape(int l, int b) {
        this.l = l;
        this.b = b;
        count++;
    }

    public Shape(int side) {
        this.l = side;
        count++;
    }

    public void areaSquare() {
        System.out.println("Area of Square : " + l * l);
        System.out.println("Perimeter of Square : " + l * 4);
    }

    public void areaRect() {
        System.out.println("Area of Rectangle: " + l * b);
        System.out.println("Perimeter of Rectangle: " + 2 * (l + b));
    }

    public static void main(String[] args) {
----=
        Shape rectangle = new Shape(10, 12);

        Shape Square = new Shape(5);
        Shape Square1 = new Shape(5);

        System.out.println("\nArea and perimeter of various shapes:");
        System.out.println("\nSquare");
        Square.areaSquare();

        System.out.println("\nReactangle");
        rectangle.areaRect();
        System.out.println("Number of times object created :" + count);
    }
}