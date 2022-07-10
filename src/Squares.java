public class Squares extends Rectangles{

    Squares(String color, int side) {
        super(color, side, side);
    }

    void displayColor() {
        System.out.println("the color of sqaure is " + "=>" + super.color);
        return;
    }

}