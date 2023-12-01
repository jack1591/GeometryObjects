public class Circle extends GeometryObjects{
    double radix;
    public Circle(double radix) {
        this.radix = radix;
        square=getSquare();
    }

    @Override
    double getSquare() {
        return Math.PI*radix*radix;
    }

    @Override
    void setScale(int scale) {
        radix*=scale;
        square=getSquare();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radix=" + radix +
                ", square=" + square +
                '}';
    }
}
