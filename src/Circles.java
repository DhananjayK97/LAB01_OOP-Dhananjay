public class Circles extends Shapes {

    int radius;
    final double PI = 3.14;

    Circles(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    double calculateArea() {
        return this.PI * Math.pow(this.radius, 2);
    }

    double calculatePerimeter() {
        return 2 * this.PI * this.radius;
    }

    void displayColor() {
        System.out.println("the color of circle is " + "=>" + super.color);
        return;
    }

}