package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    // Override methods from Rectangle
    public int getPerimeter() {
        return 4 * this.width;
    }

    public int getArea() {
        return (int) Math.pow(this.width, 2);
    }
}
