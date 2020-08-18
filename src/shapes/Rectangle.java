package shapes;

//public class Rectangle {
//    protected int length;
//    protected int width;
//
//    public Rectangle(int width, int length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public int getPerimeter() {
//        return 2 * length + 2 * width;
//    }
//
//    public int getArea() {
//        return length * width;
//    }
//}

public class Rectangle extends Quadrilateral {

    public Rectangle(int width, int length) {
        super(width, length);
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
