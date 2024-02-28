//write a java code to create class name shape.create a object of shape and calculate the area and perimeter of the shape

public class Shape {

    int l;
    int b;

    public Shape(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public Shape(int side) {
        this.l = side;
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
        // create some shapes
        Shape rectangle = new Shape(10, 12);
        Shape Square = new Shape(5);

        // calculate area and perimeter of each shape
        System.out.println("\nArea and perimeter of various shapes:");
        System.out.println("\nSquare");
        Square.areaSquare();

        System.out.println("\nReactangle");
        rectangle.areaRect();
    }
}