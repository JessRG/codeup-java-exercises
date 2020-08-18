package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable box1 = new Rectangle(4, 5);
        System.out.println(
                String.format("\nbox1\n----\ngetPerimeter: %.3f\ngetArea: %.3f", box1.getPerimeter(), box1.getArea())
        );

        // The methods that are overridden in the Square class
        Measurable box2 = new Square(5);
        System.out.println(
                String.format("\nbox2\n----\ngetPerimeter: %.3f\ngetArea: %.3f", box2.getPerimeter(), box2.getArea())
        );
    }
}
