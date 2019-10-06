public class Rectangle {
    double length;
    double width;
    String dimension;

    public Rectangle(double _length, double _width, String _dimension) {
        length = _length;
        width = _width;
        dimension = _dimension;
    }

    public double calculateArea() {

        return length * 2 + width * 2;
    }
}
