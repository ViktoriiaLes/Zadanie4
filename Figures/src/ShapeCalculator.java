public class ShapeCalculator {

    double squareArea(Square square) {
        return Math.pow(square.width, 2);
    }

    double circleArea(Circle cirle) {
        return Math.PI * (Math.pow(cirle.radius, 2));
    }

    double trianglePerimeter(Triangle triangle) {
        return triangle.side1 + triangle.side2 + triangle.side3;
    }
double rectPerimeter(Rectangle rectangle){
        return  rectangle.width*2+rectangle.length*2;
}
}
