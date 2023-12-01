public class Kvadrat extends GeometryObjects{

    double a,b;

    public Kvadrat(double a, double b) {
        this.a = a;
        this.b = b;
        square=getSquare();
    }

    @Override
    double getSquare() {
        return a*b;
    }
    @Override
    void setScale(int scale) {
        a*=scale;
        b*=scale;
        square=getSquare();
    }

    @Override
    public String toString() {
        return "Kvadrat{" +
                "a=" + a +
                ", b=" + b +
                ", square=" + square +
                '}';
    }
}
