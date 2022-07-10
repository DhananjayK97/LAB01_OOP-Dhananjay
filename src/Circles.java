public class Circles extends Shapes {

    int radius;
    final double PI = 3.14;

    Circles(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return this.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 *PI*this.radius;
    }

    @Override
    void display(){
        System.out.println("This is a " + super.color + " " + "Circle");

    }

}
