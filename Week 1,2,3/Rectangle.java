// ShapeDemo.java
public class ShapeDemo {
    public static void main(String[] args) {
        // Creating two objects of the Rectangle class
        Rectangle rectangle1 = new Rectangle(5, 8);
        Rectangle rectangle2 = new Rectangle(3, 6);

        // Calculating area and perimeter
        System.out.println("Rectangle 1 Area: " + rectangle1.area());
        System.out.println("Rectangle 1 Perimeter: " + rectangle1.perimeter());

        System.out.println("Rectangle 2 Area: " + rectangle2.area());
        System.out.println("Rectangle 2 Perimeter: " + rectangle2.perimeter());
    }

    // Rectangle class as a subclass of Shape
    static class Rectangle {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double area() {
            return length * width;
        }

        public double perimeter() {
            return 2 * (length + width);
        }
    }
}
