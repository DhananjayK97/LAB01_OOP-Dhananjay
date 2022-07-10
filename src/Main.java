public class Main {
    public static void main(String[] args) {
        Circles circles = new Circles("red", 6);
        System.out.println(circles.calculateArea());
        circles.display();

        Triangles triangle = new Triangles("orange", 12, 7);
        System.out.println(triangle.calculateArea());
        triangle.display();

        Rectangles rectangle = new Rectangles("green", 2, 3 );
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        rectangle.display();
        
        Squares square = new Squares("blue", 5);
        System.out.println(square.calculatePerimeter());
        square.display();
    }
}
