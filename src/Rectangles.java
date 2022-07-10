public class Rectangles extends Shapes{

    int length, width;
    final double PI = 3.14;

    public Rectangles(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    public void display() {
        System.out.println("This is a" + super.color + " " + " Rectangle");
    }
}
