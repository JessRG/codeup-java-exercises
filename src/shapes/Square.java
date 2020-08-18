package shapes;

//public class Square extends Rectangle {
//
//    public Square(int side) {
//        super(side, side);
//    }
//
//    // Override methods from Rectangle
//    public int getPerimeter() {
//        return 4 * this.length;
//    }
//
//    public int getArea() {
//        return (int) Math.pow(this.length, 2);
//    }
//}

public class Square extends Quadrilateral {

    public Square(int sides) {
        this.length = sides;
        this.width = sides;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}
