package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println(
                String.format("\nbox1\n----\ngetPerimeter: %d\ngetArea: %d", box1.getPerimeter(), box1.getArea())
        );

        // The methods that are overridden in the Square class
        Rectangle box2 = new Square(5);
        System.out.println(
                String.format("\nbox2\n----\ngetPerimeter: %d\ngetArea: %d", box2.getPerimeter(), box2.getArea())
        );
    }
}
