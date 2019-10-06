public class Square {
    double width;
    String dimension;

    public Square(double _width, String _dimension) {
        width = _width;
        dimension= _dimension;
    }
     public double squareArea() {
        return Math.pow(width, 2);
    }
}
