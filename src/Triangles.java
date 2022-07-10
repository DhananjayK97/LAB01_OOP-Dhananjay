public class Triangles extends Shapes {
        int height, base;
        final double PI = 3.14;

        Triangles(String color, int height, int base) {
            super(color);
            this.height = height;
            this.base = base;
        }

        double calculateArea() {
            return this.height * this.base;
        }

        double calculatePerimeter() {
            return (this.height + this.base) + Math.sqrt(this.height ^ 2 + this.base ^ 2);
        }

        void displayColor() {
            System.out.println("the color of triangle is " + "=>" + super.color);
            return;
        }
    }
}
