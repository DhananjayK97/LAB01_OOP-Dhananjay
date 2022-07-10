public class Main {
    public static void main(String[] args) {
        Circles c1 = new Circles("red", 10);
        System.out.println(c1.calculateArea());
        c1.displayColor();

        Squares s1 = new Squares("blue", 4);
        System.out.println(s1.calculatePerimeter());
        s1.displayColor();

        Triangles t1 = new Triangles("orange", 12, 7);
        System.out.println(t1.calculateArea());
        t1.displayColor();

    }
}