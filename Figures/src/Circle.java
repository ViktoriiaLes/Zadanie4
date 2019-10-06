public class Circle {
    double radius;
    String dimension;

    public Circle(double _radius, String _dimension) {
        radius = _radius;
        dimension = _dimension;
    }

    public double circleArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
}
