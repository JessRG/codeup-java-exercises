package shapes;

public abstract class Quadrilateral extends Shape {
    protected int length;
    protected int width;

    public Quadrilateral() {}

    public Quadrilateral(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return 2 * getWidth() + 2 * getLength();
    }
    @Override
    public double getArea() {
        return getWidth() * getLength();
    }

    public abstract void setLength(int length);
    public abstract void setWidth(int width);
}
