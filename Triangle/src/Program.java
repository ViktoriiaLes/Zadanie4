public class Program {
    public static void main(String[] args) {
        RightTriangleVerifier rightTriangleVerifier= new RightTriangleVerifier ();
        Triangle triangle1 = new Triangle(1,2,3);
        System.out.printf("Triangle with sides %1$.2f, %2$.2f, %3$.2f is right:%4$s\n", triangle1.side1, triangle1.side2,
                triangle1.side3, rightTriangleVerifier.isRightTriangle(triangle1));

        Triangle triangle2 = new Triangle(3,4,5);
        System.out.printf("Triangle with sides %1$.2f, %2$.2f, %3$.2f is right:%4$s", triangle2.side1, triangle2.side2,
                triangle2.side3, rightTriangleVerifier.isRightTriangle(triangle2));
    }

}
