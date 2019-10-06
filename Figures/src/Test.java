public class Test {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Square square = new Square(5.6, "cm");
        System.out.printf("Area of square with side width %1$.2f%3$s is %2$.2f%3$s2\n", square.width, shapeCalculator.squareArea(square), square.dimension);

        Circle circle = new Circle(7.8, "cm");
        System.out.printf("Area of circle with radius %1$.2f%3$s is %2$.2f%3$s2\n", circle.radius, shapeCalculator.circleArea(circle), circle.dimension);

        Triangle triangle = new Triangle(2.4, 7, 8.9, "cm");
        System.out.printf("Perimeter of triangle with sides %1$.2f%4$s, %2$.2f%4$s, %3$.2f%4$s is %5$.2f%4$s2\n", triangle.side1, triangle.side2, triangle.side3, triangle.dimension, shapeCalculator.trianglePerimeter(triangle));

        Rectangle rectangle = new Rectangle(9, 4, "cm");
        System.out.printf("Perimeter of rectangle with length %1$.2f%3$s, width %2$.2f%3$s is %4$.2f%3$s\n", rectangle.length, rectangle.width, rectangle.dimension, shapeCalculator.rectPerimeter(rectangle));
    }
}
