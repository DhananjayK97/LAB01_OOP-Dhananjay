public class Squares extends Rectangles{

    Squares(String color, int side) {
        super(color, side, side);
    }

    @Override
    public void display() {
        System.out.println("This is a" + super.color + " " + "square");
    }

}