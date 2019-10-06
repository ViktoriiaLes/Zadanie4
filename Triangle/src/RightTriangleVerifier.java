public class RightTriangleVerifier {
    public boolean  isRightTriangle (Triangle triangle){
        return (Math.pow(triangle.side1,2)==Math.pow(triangle.side2,2)+Math.pow(triangle.side3,2))
                ||(Math.pow(triangle.side1,2)+Math.pow(triangle.side2,2)==Math.pow(triangle.side3,2))
                ||(Math.pow(triangle.side2,2)==Math.pow(triangle.side1,2)+Math.pow(triangle.side3,2));
    }
}
