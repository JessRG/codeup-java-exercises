package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(4, 5);
        System.out.println(
                String.format("\nbox1\n----\ngetPerimeter: %.3f\ngetArea: %.3f", myShape.getPerimeter(), myShape.getArea())
        );

        // The methods that are overridden in the Square class
        myShape = new Square(5);
        System.out.println(
                String.format("\nbox2\n----\ngetPerimeter: %.3f\ngetArea: %.3f", myShape.getPerimeter(), myShape.getArea())
        );

//        System.out.println(String.format("getLength(): %d getWidth(): %d", myShape.getLength(), myShape.getWidth()));
    }
}
