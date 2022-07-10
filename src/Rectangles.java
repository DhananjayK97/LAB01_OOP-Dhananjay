public class Rectangles extends Shapes{

    int length, width;
    final double PI = 3.14;

    Rectangles(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return this.length * this.width;
    }

    double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    void displayColor() {
        System.out.println("the color of rectangle is " + "=>" + super.color);
        return;
    }
}